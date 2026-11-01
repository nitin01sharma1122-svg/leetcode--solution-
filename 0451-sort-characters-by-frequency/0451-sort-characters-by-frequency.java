class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        String ans = "";

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        while (!map.isEmpty()) {

            char maxChar = 0;
            int max = 0;

            for (char ch : map.keySet()) {
                if (map.get(ch) > max) {
                    max = map.get(ch);
                    maxChar = ch;
                }
            }

            for (int i = 0; i < max; i++) {
                ans += maxChar;
            }

            map.remove(maxChar);
        }

        return ans;
    }
}