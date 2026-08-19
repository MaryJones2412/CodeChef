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
            HashMap<Integer, Integer> freqMap = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                int dollType = sc.nextInt();
                freqMap.put(dollType, freqMap.getOrDefault(dollType, 0) + 1);
            }
            
            int missingDoll = -1;
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    missingDoll = entry.getKey();
                    break;
                }
            }
            
            System.out.println(missingDoll);
        }
        
        sc.close();
    }
}