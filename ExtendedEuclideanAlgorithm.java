import java.util.Scanner;
public class ExtendedEuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        int[] result = extendedEuclidean(a, b);
        System.out.println("GCD(" + a + ", " + b + ") = " + result[0]);
        System.out.println("x = " + result[1]);
        System.out.println("y = " + result[2]);
    }
    public static int[] extendedEuclidean(int a, int b) {
        if (b == 0) {
            return new int[]{a, 1, 0}; // Base case: GCD(a, 0) = a, x = 1, y = 0
        }
        int[] result = extendedEuclidean(b, a % b);
        int gcd = result[0];
        int x1 = result[1];
        int y1 = result[2];
        int x = y1;
        int y = x1 - (a / b) * y1;
        return new int[]{gcd, x, y};
    }
}