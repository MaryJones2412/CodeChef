import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> st = new HashSet<>();
            
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                st.add(value);
            }
            
            System.out.println(st.size());
        }
        
        sc.close();
    }
}