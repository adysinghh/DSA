
// LeetCode Problem: 18. 4Sum
// Same approach as 3Sum, but with an additional loop in both pointer and optimal approach.
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        sort(nums, n);
        
        for(int i = 0; i<n ;i++) {
            if( i>0 && nums[i] == nums[i-1]) continue;
            for( int j=i+1; j<n; j++) {
                if(j!=(i+1) && nums[j] == nums[j-1]) continue;

                int k = j+1;
                int l = n-1;

                while(k<l) {
                    long sum = nums[i];

                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];

                    if(sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        k++;l--;
                        
                        while(k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                        
                    } else if (sum < target) {
                        k++;
                    } else l--;
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