import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            String s = scanner.next();

            boolean isHappy = false;

            for (int i = 0; i <= s.length() - 3; i++) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(i + 1);
                char c3 = s.charAt(i + 2);

                if (isVowel(c1) && isVowel(c2) && isVowel(c3)) {
                    isHappy = true;
                    break;
                }
            }

            if (isHappy) {
                System.out.println("HAPPY");
            } else {
                System.out.println("SAD");
            }
        }
        scanner.close();
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}