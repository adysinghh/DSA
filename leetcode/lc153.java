// LeetCode Problem: Find Minimum in Rotated Sorted Array

class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int low = 0, high = n-1;
        int ans = Integer.MAX_VALUE;

        while(low <= high) {
            int mid = (low+high) / 2;

            if (arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            } else {
                high = mid - 1;
                ans = Math.min(ans, arr[mid]);
            }
        }

        return ans;
    }
}