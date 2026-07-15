from Python.TwoPointers.first_occurance import find_first_occurrence
from Python.TwoPointers.merge_arrays import merge_arrays
from Python.TwoPointers.remove_element import remove_element
from remove_duplicates import RemoveDuplicates

"""
1. Opposite Ends - works for sorted array to find pairs and sequence matching
2. Fast & Slow - works for replace duplicates with unique
3. Two Arrays / Zipper - combining or comparing two arrays or strings
"""

nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
"""
s = 0, f = 1
s = 0, f = 2
s = 1
"""
remove_duplicates = RemoveDuplicates(nums=nums)
# print(remove_duplicates.execute())

"""
s = 0, f = 0, t = 3,
nums[f] != t => nums[s] = nums[f], s++
"""
nums = [0, 1, 2, 2, 3, 0, 4, 2]
target = 2
print("Remove Element:")
# print(remove_element(nums, target))

n = "sad"
h = "sadbutsad"
"""
Get n's length => 3
l = 0
r = n.len -1 (2)
"""
print("Find First Occurrence")
print(find_first_occurrence(h, n))

"""
total_len = 6
nums[1] = 1
nums[j] = 2
"""
nums1 = [1, 2, 3]
nums2 = [2, 5, 6]
m = len(nums1)
n = len(nums2)

print("Merge Arrays:")
print(merge_arrays(nums1, m, nums2, n))
