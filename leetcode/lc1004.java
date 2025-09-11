// 1004. Max Consecutive Ones III

class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length, zeros = 0, maxLen = 0, l = 0, r = 0;

        //Brute Force
        // for (int i = 0; i<n; i++) {
        //     zeros = 0;

        //     for (int j = i; j<n; j++) {
        //         if (nums[j] == 0) zeros++;
        //         if (zeros <= k) maxLen = Math.max(maxLen, j-i+1);
        //         else break; // break if zeros exceeds the k limit.
        //     }
        // }

        while (r < n) {
            if(nums[r]==0) {
                zeros++;
            }
            while(zeros>k) {
                if(nums[l]==0) zeros--;
                l++;
            }
            // update max
            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }    
        return maxLen;
    }
}