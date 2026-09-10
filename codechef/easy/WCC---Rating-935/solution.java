import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt();
            String s = sc.next();
            
            int c = 0, n = 0;
            for (char ch : s.toCharArray()) {
                if (ch == 'C') c += 2;
                else if (ch == 'N') n += 2;
                else { c++; n++; }
            }
            
            System.out.println(c > n ? 60 * x : (c < n ? 40 * x : 55 * x));
        }
        sc.close();
    }
}