import java.util.*;

class Solution {

    void getAllCombinations(List<Integer> arr, int idx, int tar,
                            List<List<Integer>> ans, List<Integer> combin,
                            Set<String> seen) {

        if (tar < 0 || idx == arr.size()) return;

        if (tar == 0) {
            String key = combin.toString();
            if (!seen.contains(key)) {
                ans.add(new ArrayList<>(combin));
                seen.add(key);
            }
            return;
        }

        // include current element once
        combin.add(arr.get(idx));
        getAllCombinations(arr, idx + 1, tar - arr.get(idx), ans, combin, seen);

        // include current element multiple times
        getAllCombinations(arr, idx, tar - arr.get(idx), ans, combin, seen);

        // backtrack
        combin.remove(combin.size() - 1);

        // exclude current element
        getAllCombinations(arr, idx + 1, tar, ans, combin, seen);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combin = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        List<Integer> arr = new ArrayList<>();

        for (int num : candidates) {
            arr.add(num);
        }

        getAllCombinations(arr, 0, target, ans, combin, seen);
        return ans;
    }
}
