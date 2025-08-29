// 1614. Maximum Nesting Depth of the Parentheses

class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int res = 0, curr = 0;

        for(int i = 0; i<n; i++) {
            if(s.charAt(i) == '(') {
                curr++;
                res = Math.max(res, curr); // since, we need the max val of curr and curr is dec when ')' is encoutered, so it will give max when "(" is encountered.
            }
            if(s.charAt(i) == ')') {
                    curr--;
            }
        }

        return res;
    }
}