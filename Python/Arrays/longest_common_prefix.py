# Brute force but failed in some cases
def find_longest_common_prefix(strings: list[str]) -> str:
    if len(strings) == 1: return strings[0]

    smallest_string_dict = find_smallest_string_and_pop_it(strings)
    mapped: dict = smallest_string_dict['map']
    smallest_string = smallest_string_dict['smallest_string']

    print(smallest_string_dict)

    prefix = ""
    for i in range(0, len(strings)):
        if i == smallest_string_dict['index']: pass
        for j in range(0, len(smallest_string)):
            if smallest_string[j] == strings[i][j]:
                mapped[smallest_string[j]] = mapped[smallest_string[j]] + 1
            else:
                pass

    for k in mapped:
        if mapped[k] == len(strings):
            prefix += str(k)
        if mapped[k] < len(strings):
            break

    return prefix


"""
Input: strs = ["flower","flow","flight"]
Output: "fl"
"""

"""
Approach
1. Find smallest string in the list
2. Store the index and store each char in a dic
3. compare it with other string's characters and increase count and if first char doesn't match return ""
"""


def find_smallest_string_and_pop_it(strings: list[str]) -> dict:
    idx = 0
    for i in range(1, len(strings)):
        if len(strings[idx]) > len(strings[i]):
            idx = i

    string_map: dict = {}

    for i in range(0, len(strings[idx])):
        string_map.setdefault(strings[idx][i], 0)

    return {
        "smallest_string": strings[idx],
        "map": string_map,
        "index": idx
    }


def optimized_approach(strs: list[str]) -> str:
    prefix = ""

    if len(strs) == 0: return prefix
    if len(strs) == 1: return strs[0]

    smallest_string = find_smallest_string_and_pop_it(strs)['smallest_string']

    for i in range(len(smallest_string)):
        selected_character = smallest_string[i]
        for j in range(len(strs)):
            if selected_character != strs[j][i]:
                return prefix
        prefix = prefix + selected_character

    return prefix


print(optimized_approach(["flower","flow","flight"]))
