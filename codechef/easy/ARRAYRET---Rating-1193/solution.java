import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] b = new long[n];
            long bigSum = 0;
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextLong();
                bigSum += b[i];
            }
            long smallSum = bigSum / (n + 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append((b[i] - smallSum)).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
        scanner.close();
    }
}