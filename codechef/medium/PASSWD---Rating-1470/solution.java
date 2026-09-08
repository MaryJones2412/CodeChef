import java.util.*;

class Codechef {
    public static boolean isSecurePassword(String s) {
        HashSet<Character> specialChars = new HashSet<>();
        specialChars.add('@');
        specialChars.add('#');
        specialChars.add('%');
        specialChars.add('&');
        specialChars.add('?');
        
        boolean len = s.length() >= 10;
        boolean small = false, large = false, digit = false, spec = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') small = true;
            if (i != 0 && i != s.length() - 1) {
                if (c >= 'A' && c <= 'Z') large = true;
                if (c >= '0' && c <= '9') digit = true;
                if (specialChars.contains(c)) spec = true;
            }
        }

        return len && small && large && digit && spec;
    }

    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  // Consume the newline

        for (int i = 0; i < t; i++) {
            String password = sc.nextLine();
            System.out.println(isSecurePassword(password) ? "YES" : "NO");
        }
        sc.close();
    }
}