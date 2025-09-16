//1358. Number of Substrings Containing All Three Characters

class Solution {
    public int numberOfSubstrings(String s) {
        int[] LastSeen = {-1, -1, -1};
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            LastSeen[s.charAt(i) - 'a'] = i; //gives index of the character.

            if(LastSeen[0] != -1 && LastSeen[1] != -1 && LastSeen[2] != -1) {
                int minLast = Math.min(LastSeen[0], Math.min(LastSeen[1], LastSeen[2]));
                cnt += (1 + minLast);
            }
        }
        return cnt;
    }
}