class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int lcount = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                lcount++;
                if(lcount > count){
                    count = lcount;
                }
            } else {
                lcount = 0;
            }
        }
        return count;
    }
}