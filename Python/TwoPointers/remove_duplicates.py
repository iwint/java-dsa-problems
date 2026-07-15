#  Remove duplicates from array

class RemoveDuplicates:
    nums: list[int] = []

    def __init__(self, nums: list[int]):
        self.nums = nums

    def execute(self) -> int:
        nums = self.nums

        if len(nums) == 0:
            return 0

        slow = 0

        for fast in range(1, len(nums)):

            if nums[fast] != nums[slow]:
                slow += 1
                nums[slow] = nums[fast]

        print(nums[0:(slow + 1)])
        return slow + 1
