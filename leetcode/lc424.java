// 424. Longest Repeating Character Replacement

class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        int l = 0, maxlen = 0, maxfreq = 0;

        for (int r = 0; r < n; r++) {
            freq[s.charAt(r) - 'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(r) - 'A']);

            // If window size - most frequent char count > k, shrink from left
            while ((r - l + 1) - maxfreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1);
        }

        return maxlen;
    }
}
