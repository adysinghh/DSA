// LeetCode Problem: 1283. Find the Smallest Divisor Given a Threshold

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1, m = 0, sum = 0;
        int r = findMax(nums);

        while(l<=r) {
            m = (l+r)/2;
            sum = calSum(nums, m);

            if (sum>threshold) { // when div is small then sum is large, example - div as 1
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return l;
    }

    int calSum(int[] arr, int div) {
        int sum = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            sum += (int) Math.ceil((double) arr[i] / (double) div);
        }

        return sum;
    }

    int findMax(int[] arr) {
    if (arr == null || arr.length == 0) {
        throw new IllegalArgumentException("Array is empty or null");
    }

    int maxint = arr[0]; // start with the first element
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > maxint) {
            maxint = arr[i];
        }
    }
    return maxint;
}

}