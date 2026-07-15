def find_first_occurrence(h: str, n: str) -> int:
    n_len = len(n)
    h_len = len(h)

    if n_len == 0: return 0

    for i in range(0, (h_len - n_len) + 1):
        j = 0

        while j < n_len and h[i + j] == n[j]:
            j += 1

        if j == n_len: return i

    return -1
