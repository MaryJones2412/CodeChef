import java.util.*;

class Solution {
    public static int findSum(String s) {
        HashSet<Character> set = new HashSet<>();

        for (char ch = '0'; ch <= '9'; ch++) {
            set.add(ch);
        }

        int sum = 0;
        String num = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (set.contains(ch)) {
                num += ch;
            } else {
                if (!num.equals("")) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }

        if (!num.equals("")) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}