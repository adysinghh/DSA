// LeetCode Problem: Find Kth Positive Integer
// Binary Search implmentation is needed for optimal solution, but here is a simple linear approach.

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i<n; i++) {
            if(arr[i] <= k) k++;
            else break;
        }
        return k;
    }
}