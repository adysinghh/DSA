// Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int left = m-1;
        int right = 0;

        while(left >= 0 && right < n) {
            if(nums1[left] > nums2[right]) {
                swap(nums1, nums2, left, right);
                left--;
                right++;
            } else {
                break;
            }
        }
        // copy nums2 into the tail of nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        sort(nums1, m + n);
    }

    void swap(int[] nums1, int[] nums2, int i, int j) {
        int temp = nums1[i];
        nums1[i] = nums2[j];
        nums2[j] = temp;
    }

    void sort(int[] arr, int len) {
        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}