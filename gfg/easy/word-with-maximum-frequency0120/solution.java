import java.util.*;

class Solution {
    public String maximumFrequency(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = s.split(" ");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String answer = words[0];
        int max = 0;

        for (String word : words) {
            if (map.get(word) > max) {
                max = map.get(word);
                answer = word;
            }
        }

        return answer + " " + max;
    }
}