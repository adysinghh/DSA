// 14. Longest Common Prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        

        Arrays.sort(strs);

        char[] firstElem = strs[0].toCharArray();
        char[] lastElem  = strs[strs.length-1].toCharArray();

        int n = firstElem.length;

        for (int i = 0; i < n; i++) {
            if (firstElem[i] != lastElem[i]) break;
            result.append(firstElem[i]);
        }

        return result.toString();
    }
}