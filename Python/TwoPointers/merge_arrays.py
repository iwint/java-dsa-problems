"""
nums1 = [1, 2, 3]
nums2 = [2, 5, 6]

i = 0; j = 0
nums1[j] >= nums2[i]; 1 > 2
"""


def brute_force_merge_arrays(nums1, m, nums2, n):
    for i in range(n):
        j = 0
        while j < (m + n):
            if nums1[j] >= nums2[i]:
                nums1.insert(j, nums2[i])
                break
            j += 1

        if nums1[j] < nums2[i]:
            nums1[m + i] = nums2[i]

    return nums1


def merge_arrays(nums1, m, nums2, n):
    p1 = m - 1
    p2 = n - 1
    p = m + n - 1

    while p1 >= 0 and p2 >= 0:

        if nums1[p1] > nums2[p2]:
            nums1[p] = nums1[p1]
            p1 -= 1
        else:
            nums1[p] = nums2[p2]
            p2 -= 1
        p -= 1

    while p2 >= 0:
        nums1[p] = nums2[p2]
        p -= 1
        p2 -= 1

    return nums1
