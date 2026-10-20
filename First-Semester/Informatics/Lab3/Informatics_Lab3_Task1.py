# Author = Abdulmujib Nizary Migambile
# Group = P3130
# Date = 13.10.2026

import re

# "ВТ", then 0-4 words, then "ИТМО". A word is a sequence of \w symbols.
FRAGMENT_PATTERN = r"\bВТ(?:\W+\w+){0,4}\W+ИТМО\b"
WORD_PATTERN = r"\w+"


def find_fragments(text):
    fragments = []
    for match in re.finditer(FRAGMENT_PATTERN, text):
        words = re.findall(WORD_PATTERN, match.group())
        fragments.append(" ".join(words))
    return fragments


def run_test(number, text, expected):
    result = find_fragments(text)
    status = "OK" if result == expected else "FAIL"
    print(f"Test {number}: {status}")
    print(f"  input:    {text}")
    print(f"  expected: {expected}")
    print(f"  got:      {result}")


def main():
    run_test(1, "А ты знал, что ВТ – лучшая кафедра в ИТМО?",
             ["ВТ лучшая кафедра в ИТМО"])
    run_test(2, "ВТ ИТМО", ["ВТ ИТМО"])
    run_test(3, "ВТ один два три четыре ИТМО", ["ВТ один два три четыре ИТМО"])
    run_test(4, "ВТ один два три четыре пять ИТМО", [])
    run_test(5, "ВТ это ИТМО, а ВТ тоже ИТМО!",
             ["ВТ это ИТМО", "ВТ тоже ИТМО"])
    run_test(6, "ВТБ банк и ИТМО, АВТ ИТМО", [])


main()
