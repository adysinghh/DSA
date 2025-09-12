// Leetcode 340. Longest Substring with At Most K Distinct Characters

import java.util.HashMap;

public class lc_locked {
    public static void main(String[] args) {

        String s = "aaabbccd";
        int k = 2;

        int res = atMostK(s, k);
        System.out.println(res);
        
    }

    public static int atMostK(String s, int k) {

    int maxlen = 0, l = 0, r = 0;
    HashMap<Character, Integer> map = new HashMap<>();

    while (r < s.length()) {
        char c = s.charAt(r);
        map.put(c, map.getOrDefault(c, 0) + 1);

        while (map.size() > k) {
            char leftChar = s.charAt(l);
            map.put(leftChar, map.getOrDefault(leftChar, 0) - 1);

            if (map.get(leftChar) == 0) {
                map.remove(leftChar);
            }
            l++;
        }

        maxlen = Math.max(maxlen, r - l + 1);
        r++;
    }

    return maxlen;
}

}
