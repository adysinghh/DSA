class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0], sum = 0, n = nums.length;

        // This loop fails time complexity - 205/210 pass.
        // for (int i = 0; i<nums.length; i++) {
        //     for (int j = i; j<nums.length; j++) {
        //         sum += nums[j];

        //         if (sum > max) {
        //             max = sum;
        //         }
        //     }
        //     sum = 0;
        // }

        for (int i = 0; i<n; i++) {
            sum += nums[i];

            max = sum>max?sum:max;

            if (sum < 0) sum = 0;
        }

        return max;
    }
}