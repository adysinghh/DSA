// LeetCode Problem: Find Peak Element

class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int l = 0, h = n-1;
        int m = 0;

        if (n<=1) return 0;

        while (l <= h) {
            m = (l+h) / 2;

            if (h != 0 && h == n-1 && nums[h] >= nums[h-1]) return h;
            if (l != n-1 && l == 0 && nums[l] >= nums[l+1]) return l;
            if (m != 0 && m != n-1 && nums[m] >= nums[m-1] && nums[m] >= nums[m+1]) return m;


            if(m!=0 && m!=n-1 && nums[m] >= nums[m+1] && nums[m] <= nums[m-1]) { // Decreasing Curve
                h = m-1;
            } else { // nums[m] >= nums[m-1] && nums[m] <= nums[m+1] - Increasing curve;
                l = m+1;
            }
        }

        return -1;
    }
}