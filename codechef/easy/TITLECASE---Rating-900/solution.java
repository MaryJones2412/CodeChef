import java.util.Scanner;

class CodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.nextLine()); 

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] w = s.split(" ");
            StringBuilder sb = new StringBuilder();

            for (String x : w) {
                if (x.equals(x.toUpperCase())) {
                    sb.append(x);
                } else {
                    String f = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
                    sb.append(f);
                }
                sb.append(" ");
            }

            System.out.println(sb.toString().trim());
        }

        sc.close();
    }
}