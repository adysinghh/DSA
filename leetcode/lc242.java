//242. Valid Anagram

class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n!=m) return false;

        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        for(char c : s.toCharArray()) {
            smap.put(c, smap.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        }

        if(smap.equals(tmap)) return true;

        return false;
    }
}