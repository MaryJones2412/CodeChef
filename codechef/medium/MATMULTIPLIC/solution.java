import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int n2 = scanner.nextInt();
        int p = scanner.nextInt();

        int[][] b = new int[n2][p];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < p; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        int[][] c = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}