// 974. Subarray Sums Divisible by K


class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int count = 0;

        // for (int i = 0; i<nums.length; i++) {
        //     for (int j = i; j<nums.length; j++) {
        //         sum += nums[j];

        //         if (sum % k == 0) {
        //             count++;
        //         }
        //     }
        //     sum = 0;
        // }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for (int n : nums) {
            sum += n;
            int r = sum%k;

            if (r<0) r+=k;

            if(map.containsKey(r)) {
                count += map.get(r);
            }
            map.put(r, map.getOrDefault(r, 0) + 1);
        }

        return count;
    }
}