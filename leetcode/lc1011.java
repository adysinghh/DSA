// LeetCode Problem: 1011. Capacity To Ship Packages Within D Days

class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int n = weights.length, sum = 0;
        for (int i =0; i<n; i++) {
            sum += weights[i];
        }
        int l = findMax(weights), h = sum;
        int m = 0;

        while (l <= h) {
            m = (l+h)/2;
            int reqDays = calcDays(weights, m);

            if (reqDays > days) { // less capcaity, inc. it.
                l = m + 1;
            } else {    // fits but need least, dec. it.
                h = m - 1;
            }
        }

        return l;
    }

    int calcDays(int[] arr, int limit) {
        int day = 1, load = 0, n = arr.length;

        for (int i = 0; i<n; i++) {
            if(arr[i] + load > limit) {
                day += 1;
                load = arr[i];
            } else {
                load += arr[i];
            }
        }

        return day;
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