// LeetCode Problem: Single Element in a Sorted Array


class Solution {
    public int singleNonDuplicate(int[] A) {
        int n = A.length;
        if (n==1) return A[0];

        int l = 0, h = n-1;

        while (l<=h) {
            int m = (l+h) / 2;

            if(m==0 && A[0] != A[1]) return A[m];
            if(m==n-1 && A[n-1] != A[n-2]) return A[m];
            if(A[m-1] != A[m] && A[m+1] != A[m]) return A[m];

            if(m%2==0) {    //even
                if(A[m-1] == A[m]) {
                    h = m-1;
                } else {
                    l = m+1;
                }
            } else {    //odd
                if(A[m-1] == A[m]) {
                    l = m+1;
                } else{
                    h = m-1;
                }
            }
        }
        return -1;
    }
}