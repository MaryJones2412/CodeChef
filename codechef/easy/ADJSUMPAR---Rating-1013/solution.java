import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] b = new int[n];
            int sum = 0;
            
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
                sum += b[i];
            }
            
            if (sum % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        
        scanner.close();
    }
}