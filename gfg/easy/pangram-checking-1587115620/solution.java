class Solution {
    public static boolean checkPangram(String s) {
        s = s.toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!s.contains(String.valueOf(ch))) {
                return false;
            }
        }

        return true;
    }
}