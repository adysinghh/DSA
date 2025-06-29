class lc169 {
    public int majorityElement(int[] nums) {
        
        int candidate = -1, count = 0;

        for (int num: nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count ++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}