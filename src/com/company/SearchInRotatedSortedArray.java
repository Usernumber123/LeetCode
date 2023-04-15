package com.company;

// time complexity O(log n) - каждую итерацию делим пополам
// space complexity O(1)
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        int mid;
        while (right >= left) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[left]) {
                if (target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
