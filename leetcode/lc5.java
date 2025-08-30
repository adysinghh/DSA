// 5. Longest Palindromic Substring

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) return s;

        String LPS = s.substring(0, 1); // at least one char is palindrome

        for (int i = 0; i < n; i++) {
            // Odd length palindrome
            int low = i, high = i;
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
                String palindrome = s.substring(low, high + 1);
                if (palindrome.length() > LPS.length()) {
                    LPS = palindrome;
                }
                low--;
                high++;
            }

            // Even length palindrome
            low = i;
            high = i + 1;
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {
                String palindrome = s.substring(low, high + 1);
                if (palindrome.length() > LPS.length()) {
                    LPS = palindrome;
                }
                low--;
                high++;
            }
        }

        return LPS;
    }
}
