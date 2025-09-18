// 1248. Count Number of Nice Subarrays

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        // int n = nums.length, cnt = 0, sum = 0;

        //BRUTE FORCE
        // for (int i = 0; i< n; i++) {
        //     if (nums[i] % 2 == 0) nums[i] = 0;
        //     else nums[i] = 1;
        // }        
        // for(int i = 0; i<n; i++) {
        //     sum = 0;
        //     for (int j = i; j<n; j++) {
        //         sum += nums[j];
        //         if (sum == k) {
        //             cnt++;
        //         }
        //     }
        // }

        // return cnt;

        // OPTIMAL:

        return atMost(nums, k) - atMost(nums, k - 1);
      
    }

    private int atMost(int[] nums, int k) { 
        int n = nums.length, cnt = 0, sum = 0;
        int l = 0, r = 0;

        if (k<0) return 0;

        while (r<n) {
            sum += nums[r] % 2;
            
            while (sum > k) {
                sum = sum - (nums[l]%2);
                l++;
            }

            cnt = cnt + (r-l+1);
            r++;
        }
        return cnt;
    }
}