// LeetCode Problem: Search a 2D Matrix II

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length, r = 0, c = m - 1;

        while (r < n && c >= 0) {
            if(matrix[r][c] == target) return true;
            else if(matrix[r][c] > target) c--;
            else  r++;
        }

        return false;
    }
}