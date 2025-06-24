class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];

        for(int i = 0; i < nums.length; i++) {
            // sum = sum + nums[i];
            sum += nums[i]; // this small change pushed TM to 0ms

            // if (sum > max) {
            //     max = sum;
            // }

            max = sum>max?sum:max;
            
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}