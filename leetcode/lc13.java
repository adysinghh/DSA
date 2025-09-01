// 13. Roman to Integer

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        int n = s.length();

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int num = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1 && hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))) {
                num -= hm.get(s.charAt(i));
            } else {
                num += hm.get(s.charAt(i));
            }
        }

        return num;
    }
}
