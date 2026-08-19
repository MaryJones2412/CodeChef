import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            int n = Integer.parseInt(scanner.nextLine());
            String[] input = scanner.nextLine().split(" ");

            HashMap<Integer, Integer> colorMap = new HashMap<>();
            int maxBoxes = 0;

            for (int i = 0; i < n; i++) {
                int count = Integer.parseInt(input[i]);
                colorMap.put(i + 1, count);
                maxBoxes = Math.max(maxBoxes, count);
            }

            System.out.println(maxBoxes);
        }

        scanner.close();
    }
}