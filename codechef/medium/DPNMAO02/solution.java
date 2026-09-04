import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		if(isAnagram(s,t))
		 System.out.println("True");
		else
		 System.out.println("False");

	}
public static boolean isAnagram(String s,String t)
	{
	    char[] a1=s.toCharArray();
	    char[] a2=t.toCharArray();
	    Arrays.sort(a1);
	    Arrays.sort(a2);
	    return Arrays.equals(a1,a2);
	}
}
