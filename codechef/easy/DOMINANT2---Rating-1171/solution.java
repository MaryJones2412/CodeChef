import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
            }
            int max_freq = 0;
            int max_freq_count = 0;

            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                int count = entry.getValue();
                if (count > max_freq) {
                    max_freq = count;
                    max_freq_count = 1;
                } else if (count == max_freq) {
                    max_freq_count++;
                }
            }

            System.out.println(max_freq_count == 1 ? "YES" : "NO");
        }
        sc.close();
    }
}