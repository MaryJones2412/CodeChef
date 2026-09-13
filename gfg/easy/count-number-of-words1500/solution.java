class Solution {
    public int countWords(String s) {
        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        return s.split("\\s+").length;
    }
}