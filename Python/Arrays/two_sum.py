def find_two_sum(nums: list[int], target: int) -> list[int]:
    for i in range(0, len(nums)):
        x = nums[i]
        y = target - x

        for j in range(i + 1, len(nums)):
            if nums[j] == y:
                return [i, j]

    return [-1, -1]


print(find_two_sum([2, 7, 11, 15], target=18))

"""
x + y = 9
x = 9 - y
"""
