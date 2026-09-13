import java.util.*;

class Solution {
    String removeDuplicates(String s) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!set.contains(ch)) {
                result.append(ch);
                set.add(ch);
            }
        }

        return result.toString();
    }
}