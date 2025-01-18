import java.util.Scanner;
public class GCDRecursive {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        int result = gcd(a, b);
        System.out.println("GCD of " + a+ " and " +b + " is: " + result);
        scanner.close();
    }
}