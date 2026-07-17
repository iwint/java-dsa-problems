def is_valid_palindrome(val: str) -> bool:
    normalized_string = "".join(ch for ch in val if ch.isalnum()).lower()

    if normalized_string == "": return False

    l = 0
    r = len(normalized_string) - 1

    while l < r:
        if normalized_string[l] != normalized_string[r]:
            return False
        l += 1
        r -= 1

    return True
