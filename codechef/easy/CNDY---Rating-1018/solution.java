import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            HashMap<Integer, Integer> map = new HashMap<>();
            boolean ok = true;

            for (int i = 0; i < 2 * n; i++) {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
                if (map.get(x) > 2) {
                    ok = false;
                }
            }

            if (ok) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}