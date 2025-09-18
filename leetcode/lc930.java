// Binary Subarrays With Sum

// THIS IS BRUTE FORCE APPROACH
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length, cnt = 0;

        for(int i = 0; i<n; i++) {
            int sum = 0;
            for (int j = i; j<n; j++) {
                sum += nums[j];

                if(sum == goal) {
                    cnt++;
                    //sum = 0 ->since, from i=0, both subarrays [1,0,1] = 2 then sum = 0 and [1,0,1,0] becomes 0 again.
                    //break -> Starting from i=0, both subarrays [1,0,1] and [1,0,1,0] are valid.
                }
            }
        }

        return cnt;
    }
}