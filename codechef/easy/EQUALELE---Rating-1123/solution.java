import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int x : a) {
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
            int maxFreq = 0;
            for (int count : freq.values()) {
                if (count > maxFreq) {
                    maxFreq = count;
                }
            }
            
            System.out.println(n - maxFreq);
        }
        sc.close();
    }
}