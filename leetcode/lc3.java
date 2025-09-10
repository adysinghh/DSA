// 3. Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {

        // for (int i = 0; i<s.length(); i++) {
        //     int count = 0;
        // HashSet<Character> mp = new HashSet<>();
        //     for (int j = i; j<s.length(); j++) {
        //         if(mp.contains(s.charAt(j))) break;
        //         mp.add(s.charAt(j));
        //         count++;
        //     }
        //     max = Math.max(max, count);
        // }

        int l=0, r=0, maxlen=0, n=s.length();
        HashSet<Character> mp = new HashSet<>();


        while(r<n) {
            char c = s.charAt(r);

            if (!mp.contains(c)) {
                mp.add(c);
                maxlen = Math.max(maxlen, r - l + 1);
                r++;
            } else {
                mp.remove(s.charAt(l));
                l++;
            }
        }
        return maxlen;
    }
}