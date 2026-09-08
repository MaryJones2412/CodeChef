import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int d1 = sc.nextInt();
            int t1 = sc.nextInt();
            int m1 = sc.nextInt();
            
            int d2 = sc.nextInt();
            int t2 = sc.nextInt();
            int m2 = sc.nextInt();
            
            int total1 = d1 + t1 + m1;
            int total2 = d2 + t2 + m2;
            
            if (total1 > total2) {
                System.out.println("Dragon");
            } else if (total2 > total1) {
                System.out.println("Sloth");
            } else {
                if (d1 > d2) {
                    System.out.println("Dragon");
                } else if (d2 > d1) {
                    System.out.println("Sloth");
                } else {
                    if (t1 > t2) {
                        System.out.println("Dragon");
                    } else if (t2 > t1) {
                        System.out.println("Sloth");
                    } else {
                        System.out.println("Tie");
                    }
                }
            }
        }
        sc.close();
    }
}