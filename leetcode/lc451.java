// 451. Sort Characters By Frequency

class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> freq = new HashMap<>();

        for(char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c,0) + 1);
        }

        // // Put into max-heap
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        maxHeap.addAll(freq.entrySet());

        // List<Map.Entry<Character, Integer>> entries = new ArrayList<>(freq.entrySet());
        // entries.sort((a,b)->b.getValue() - a.getValue());

        StringBuilder sb = new StringBuilder();
        while(!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();

            char c = entry.getKey();
            int count = entry.getValue();

            for(int i = 0; i<count; i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}