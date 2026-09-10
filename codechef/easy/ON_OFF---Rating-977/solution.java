import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String r = scanner.next();

            int changes = 0;
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) != r.charAt(j)) {
                    changes++;
                }
            }

            if (changes % 2 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        scanner.close();
    }
}