// 229. Majority Element II
// Try with Boyer-Moore Voting Algorithm

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int mini = (int)(n/3) + 1;

        for(int i = 0; i<n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) == mini) {
                ls.add(nums[i]);
            }
            if(ls.size() == 2) break;
        }

        return ls;
    }
}