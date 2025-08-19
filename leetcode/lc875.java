// LeetCode Problem: 875. Koko Eating Bananas


class Solution {
    

    int calcTotalHours(int[] arr, int h){
        int totalH = 0;
        int n = arr.length;
        
        for(int i = 0; i<n; i++) {
            totalH += Math.ceil((double) arr[i] / (double) h);
        }

        return totalH;
    }

    int maxArr(int[] arr) {
        int maxint = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i = 1; i <= n; i++) {
            maxint = Math.max(maxint, arr[i]);
        }

        return maxint;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = maxArr(piles);

        int m = 0;

        while(l<=r) {
            m = (l+r) / 2;

            int totalH = calcTotalHours(piles, m);

            if(totalH <= h) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return l;
        
    }   
}       