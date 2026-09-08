import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            long storedProtein = 0;
            boolean possible = true;
            int failedDay = -1;
            
            for (int i = 0; i < n; i++) {
                storedProtein += a[i];
                if (storedProtein < k) {
                    possible = false;
                    failedDay = i + 1;
                    break;
                }
                storedProtein -= k;
            }
            
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO " + failedDay);
            }
        }
        sc.close();
    }
}