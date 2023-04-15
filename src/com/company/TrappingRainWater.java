package com.company;

// time complexity O(n)
// space complexity O(1)
public class TrappingRainWater {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int count = 0;
        int minHeight = 0;
        while (l <= r) {
            if (height[r] < minHeight) {

                count += minHeight - height[r];
            }
            if (height[l] < minHeight) {

                count += minHeight - height[l];
            }

            if (height[r] < height[l]) {
                if (minHeight < height[r]) {
                    minHeight = height[r];
                }
                r--;
            } else {
                if (minHeight < height[l]) {
                    minHeight = height[l];
                }
                l++;
            }

        }
        return count;
    }
}
