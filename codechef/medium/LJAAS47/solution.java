import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Fixed 'scanner' to 'Scanner'
        String name = scanner.nextLine();
        System.out.println(name.charAt(7));
    }
}