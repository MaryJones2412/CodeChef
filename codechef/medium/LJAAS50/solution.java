import java.util.Scanner;
class Codechef
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println(area);
    }
}