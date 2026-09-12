import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            char[] arr = s.toCharArray();
            
            for (int i = 0; i < n - 1; i += 2) {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            
            for (int i = 0; i < n; i++) {
                arr[i] = (char) ('z' - (arr[i] - 'a'));
            }
            
            System.out.println(new String(arr));
        }
        scanner.close();
    }
}