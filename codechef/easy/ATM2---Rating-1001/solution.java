import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            StringBuilder ans = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                int withdraw = sc.nextInt();
                
                if (k >= withdraw) {
                    k -= withdraw;
                    ans.append("1");
                } else {
                    ans.append("0");
                }
            }
            
            System.out.println(ans.toString());
        }
        
        sc.close();
    }
}