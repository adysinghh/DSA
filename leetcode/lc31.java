class Solution {
    public void nextPermutation(int[] nums) {
        int indx = -1;
        int n = nums.length;

        // Find the Steep
        for(int i = n-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                indx = i;
                break;
            }
        }

        // If already last perm or max;
        if(indx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Swap left Steep with next largest
        for(int i = n-1; i > indx; i--) {
            if(nums[i] > nums[indx]) {
                swap(nums, i, indx);
                break;
            }
        }

        // reverse the rest from right steep(indx+1) to end;
        reverse(nums, indx + 1, n - 1);

    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }
}