// LeetCode Problem: 15. 3Sum
// other brute force solutions are O(n^3) and O(n^2 log n)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;
        sort(nums, n);

        for(int i = 0; i<n; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = n-1;

            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(sum < 0) j++;
                else if(sum > 0) k--;
                else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }

    void sort(int[] arr, int len) {
        for(int i = 1; i<len; i++) {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}