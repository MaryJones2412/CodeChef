import java.util.*;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        
        int n = sc.nextInt();
        sc.nextLine();
        
        while (n-- > 0) {
            String word = sc.nextLine();
            boolean ok = true;
            
            for (int i = 0; i < word.length(); i++) {
                if (!set.contains(word.charAt(i))) {
                    ok = false;
                    break;
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