import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  
        
        while (t-- > 0) {
            String s = sc.nextLine();
            int[] arr = new int[26];  
            int maxi = 0;

            for (int j = 0; j < s.length(); j++) {
                arr[s.charAt(j) - 'a']++;
                maxi = Math.max(maxi, arr[s.charAt(j) - 'a']);
            }

            System.out.println(s.length() - maxi);
        }
    }
}