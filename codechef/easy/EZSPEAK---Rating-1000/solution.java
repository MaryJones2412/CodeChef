import java.util.Scanner;

public class Main {
    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int count = 0;
            String ans = "YES";
            
            for (int i = 0; i < n; i++) {
                if (isVowel(s.charAt(i))) {
                    count = 0;
                } else {
                    count++;
                }
                
                if (count >= 4) {
                    ans = "NO";
                    break;
                }
            }
            
            System.out.println(ans);
        }
        sc.close();
    }
}