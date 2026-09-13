import java.util.*;

class Solution {
    public String removeChars(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : s2.toCharArray()) {
            set.add(ch);
        }

        StringBuilder result = new StringBuilder();

        for (char ch : s1.toCharArray()) {
            if (!set.contains(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}