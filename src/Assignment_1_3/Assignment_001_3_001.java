package Assignment_1_3;

import java.util.Scanner;

public class Assignment_001_3_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the a coefficient: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.printf("Enter the b coefficient: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.printf("Enter the c coefficient: ");
        double c = Double.parseDouble(scanner.nextLine());

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant > 0) {
            /* There are 2 roots*/
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The roots are %.2f and %.2f%n", root1, root2);

        } else if (discriminant == 0) {
            /* There is only 1 root */
            double root = -b / (2 * a);
            System.out.printf("The root is %.2f%n", root);

        } else {
            /* There are 2 imaginary roots.. just say not real.*/
            System.out.println("There is no real root.");
        }
    }
 /* Please stop making me do math. */
}
