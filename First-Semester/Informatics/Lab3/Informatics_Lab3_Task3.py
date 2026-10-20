# Author = Abdulmujib Nizary Migambile
# Group = P3130
# Date = 13.10.2026

import re

MIN_LENGTH = 5
REQUIRED_DIGITS_SUM = 25

LENGTH_PATTERN = rf".{{{MIN_LENGTH},}}"
DIGIT_PATTERN = r"\d"
UPPERCASE_PATTERN = r"[A-ZА-ЯЁ]"
SPECIAL_PATTERN = r"[^A-Za-zА-Яа-яЁё0-9\s]"
MONTH_PATTERN = (
    r"january|february|march|april|may|june|july|"
    r"august|september|october|november|december"
)


def has_pattern(pattern, password, flags=0):
    return re.search(pattern, password, flags) is not None


def digits_sum_is_correct(password):
    digits = re.findall(DIGIT_PATTERN, password)
    return sum(map(int, digits)) == REQUIRED_DIGITS_SUM


RULES = [
    ("Rule 1: Your password must be at least 5 characters.",
     lambda password: has_pattern(LENGTH_PATTERN, password)),
    ("Rule 2: Your password must include a number.",
     lambda password: has_pattern(DIGIT_PATTERN, password)),
    ("Rule 3: Your password must include an uppercase letter.",
     lambda password: has_pattern(UPPERCASE_PATTERN, password)),
    ("Rule 4: Your password must include a special character.",
     lambda password: has_pattern(SPECIAL_PATTERN, password)),
    ("Rule 5: The digits in your password must add up to 25.",
     digits_sum_is_correct),
    ("Rule 6: Your password must include a month of the year.",
     lambda password: has_pattern(MONTH_PATTERN, password, re.IGNORECASE)),
]


def failed_rules(password):
    return [message for message, check in RULES if not check(password)]


def run_test(number, password, expected_count):
    failed = failed_rules(password)
    status = "OK" if len(failed) == expected_count else "FAIL"
    print(f"Test {number}: {status} (password={password!r})")
    if failed:
        print("  failed rules:")
        for message in failed:
            print(f"    {message}")
    else:
        print("  all rules are passed")


def main():
    # digits 9+9+7 = 25
    run_test(1, "Hello!july997", 0)
    # password from the screenshot: digits sum is not 25, only rule 5 fails
    run_test(2, "KL4D_P4VLU*xx!july23>13377331WxR", 1)
    run_test(3, "A1!", 3)
    run_test(4, "hello997july", 2)
    run_test(5, "Hello!997", 1)
    run_test(6, "Abc!May9970", 0)

    print()
    password = input("Please choose a password: ")
    failed = failed_rules(password)
    if failed:
        for message in failed:
            print(f"X {message}")
    else:
        print("All rules are passed")


main()
