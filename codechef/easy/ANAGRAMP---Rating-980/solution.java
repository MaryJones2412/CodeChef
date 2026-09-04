import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
		// your code goes here
		 static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        while (t-- > 0) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(areAnagrams(str1, str2) ? "YES" : "NO");
        }

	}
}
