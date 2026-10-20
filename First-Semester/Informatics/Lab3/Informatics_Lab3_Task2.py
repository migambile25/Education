# Author = Abdulmujib Nizary Migambile
# Group = P3130
# Date = 13.10.2026

import re


def build_pattern(letters, gap):
    # letters are separated by exactly `gap` symbols (not spaces)
    separator = rf"\S{{{gap}}}"
    escaped_letters = [re.escape(letter) for letter in letters]
    core = separator.join(escaped_letters)
    # the word can have any other symbols before and after the letters
    return rf"\S*{core}\S*"


def find_words(text, letters, gap):
    pattern = build_pattern(letters, gap)
    return re.findall(pattern, text)


def run_test(number, text, letters, gap, expected):
    result = find_words(text, letters, gap)
    status = "OK" if result == expected else "FAIL"
    print(f"Test {number}: {status} (letters={letters}, gap={gap})")
    print(f"  input:    {text!r}")
    print(f"  expected: {expected}")
    print(f"  got:      {result}")


def main():
    run_test(1, "КоРмА\nКоРчмА\nКоРмБ", "КРА", 1, ["КоРмА"])
    run_test(2, "КаРбА КаРА", "КРА", 1, ["КаРбА"])
    run_test(3, "ТКаРбАХ", "КРА", 1, ["ТКаРбАХ"])
    run_test(4, "КРА КоРоА", "КРА", 0, ["КРА"])
    run_test(5, "Кабра Кокоро", "КРА", 2, [])
    run_test(6, "Ко РмА КоРмАкот", "КРА", 1, ["КоРмАкот"])


main()
