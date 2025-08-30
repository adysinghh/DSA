// 1781. Sum of Beauty of All Substrings

class Solution {
    public int maxFreq(int[] freq) {
        int max = 0;
        for(int i = 0; i<26;i++) {
            max = Math.max(max, freq[i]);
        }

        return max;
    }

    public int minFreq(int[] freq) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<26;i++) {
            if(freq[i] != 0) {
                min = Math.min(min, freq[i]);
            }
        }


        return min;
    }

    public int beautySum(String s) {
        int sum = 0, n = s.length();
        for(int i = 0; i<n; i++) {
            int[] freq = new int[26];

            for(int j = i;j<n; j++) {
                freq[s.charAt(j) - 'a']++;
                int beauty = maxFreq(freq) - minFreq(freq);

                sum += beauty;
            }
        }
        return sum;
    }
}