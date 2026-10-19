package Assignment_1_2;

import java.util.Scanner;

public class Assignment_001_2_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Present the one side of the right angle triangle: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Present the other side of the right angle triangle: ");
        double b = Double.parseDouble(scanner.nextLine());
        double hypo = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("The hypotenuse is: %.3f", hypo);
    }
}
