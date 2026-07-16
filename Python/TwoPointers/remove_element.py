def remove_element(nums: list[int], target: int) -> int:
    if len(nums) == 0 : return 0
    slow = 0

    for fast in range(0, len(nums)):

        if nums[fast] != target:
            nums[slow] = nums[fast]
            slow += 1

    return slow
