// 1901. Find a Peak Element II

class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int cols = mat[0].length;
        int left = 0, right = cols - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int maxRow = findMaxRow(mat, mid);

            int leftVal = mid - 1 >= 0 ? mat[maxRow][mid - 1] : -1;
            int rightVal = mid + 1 < cols ? mat[maxRow][mid + 1] : -1;

            if (mat[maxRow][mid] > leftVal && mat[maxRow][mid] > rightVal) {
                return new int[]{maxRow, mid};
            } else if (mat[maxRow][mid] < leftVal) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }

    private int findMaxRow(int[][] mat, int col) {
        int maxRow = 0;
        for (int i = 1; i < mat.length; i++) {
            if (mat[i][col] > mat[maxRow][col]) {
                maxRow = i;
            }
        }
        return maxRow;
    }
}