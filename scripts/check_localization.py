import argparse
import json
import re
import sys
import xml.etree.ElementTree as ET
from pathlib import Path

parser = argparse.ArgumentParser(description='Check Russian Android resources and character names.')
parser.add_argument('repository', nargs='?', type=Path, default=Path(__file__).resolve().parents[1])
parser.add_argument('--report', type=Path, help='Optionally save the JSON report to this file.')
args = parser.parse_args()
repo = args.repository.resolve()
res = repo / 'presentation/src/main/res'
errors = []

def resources(path):
    try:
        root = ET.parse(path).getroot()
    except (ET.ParseError, OSError) as exc:
        print(f'Cannot read resources: {path}: {exc}', file=sys.stderr)
        sys.exit(1)
    entries = {}
    for e in root:
        name = e.attrib['name']
        if name in entries:
            errors.append(f'Duplicate resource: {path}: {name}')
        entries[name] = e
    return entries

base = resources(res / 'values/strings.xml')
ru = resources(res / 'values-ru/strings.xml')

def placeholders(text):
    result = {}
    implicit = 0
    for m in re.finditer(r'%(?:(\d+)\$)?[-#+ 0,(]*\d*(?:\.\d+)?([a-zA-Z%])', text):
        if m[2] in ('%', 'n'):
            continue
        implicit += 1
        key = int(m[1]) if m[1] else implicit
        result[key] = m[2]
    return result

for name, e in base.items():
    if e.attrib.get('translatable') == 'false':
        continue
    if name not in ru:
        errors.append(f'Missing Russian resource: {name}')

for name, e in ru.items():
    if name not in base:
        errors.append(f'Resource absent from default locale: {name}')
        continue
    original = base[name]
    if e.tag != original.tag:
        errors.append(f'Resource type mismatch: {name}')
    if e.tag == 'string':
        if placeholders(''.join(e.itertext())) != placeholders(''.join(original.itertext())):
            errors.append(f'Format argument mismatch: {name}')
        if sorted(child.tag for child in e) != sorted(child.tag for child in original):
            errors.append(f'Markup mismatch: {name}')
    elif e.tag == 'string-array':
        if len(e) != len(original):
            errors.append(f'Array length mismatch: {name}')
        for index, (item, source) in enumerate(zip(e, original)):
            if placeholders(''.join(item.itertext())) != placeholders(''.join(source.itertext())):
                errors.append(f'Array format argument mismatch: {name}[{index}]')
    elif e.tag == 'plurals':
        quantities = {item.attrib['quantity'] for item in e}
        if quantities != {'one', 'few', 'many', 'other'}:
            errors.append(f'Incomplete Russian plural forms: {name}')
        expected = placeholders(''.join(original.find("item[@quantity='other']").itertext()))
        for item in e:
            if placeholders(''.join(item.itertext())) != expected:
                errors.append(f'Plural format mismatch: {name}')

chars = (repo / 'presentation/src/main/java/danggai/app/presentation/util/PlayableCharacters.kt').read_text(encoding='utf-8')
chars = re.sub(r'(?m)^\s*//.*$', '', chars)
char_count = len(re.findall(r'\bLocalCharacter\(', chars))
name_count = len(re.findall(r'name_ru\s*=\s*"[А-Яа-яЁё][^"]*"', chars))
if char_count != name_count:
    errors.append(f'Missing Russian character names: {name_count}/{char_count}')

version_source = (repo / 'buildSrc/src/main/kotlin/dependency/Versions.kt').read_text(encoding='utf-8')
version_name = re.search(r'const val versionName = "([^"]+)"', version_source)
version_code = re.search(r'const val versionCode = (\d+)', version_source)
report = {
    'version_name': version_name[1] if version_name else None,
    'version_code': int(version_code[1]) if version_code else None,
    'russian_resources': len(ru),
    'russian_character_names': name_count,
    'checks': ['XML parsing', 'unique names', 'resource coverage', 'format argument positions and types', 'markup preservation', 'array lengths', 'Russian plural forms', 'character name coverage'],
    'errors': errors,
}
print(json.dumps(report, ensure_ascii=False, indent=2))
if args.report:
    args.report.write_text(json.dumps(report, ensure_ascii=False, indent=2), encoding='utf-8')
sys.exit(bool(errors))
