import java.util.Scanner;

class CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String[] words = sc.nextLine().split(" ");
            String result = "";

            for (String w : words) {
                if (w.equals(w.toUpperCase())) {
                    result += w + " ";
                } else {
                    String formatted = w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase();
                    result += formatted + " ";
                }
            }
            System.out.println(result.trim());
        }
        sc.close();
    }
}