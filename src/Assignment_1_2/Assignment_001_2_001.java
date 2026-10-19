package Assignment_1_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assignment_001_2_001 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter temperature in Fahrenheit: ");
        double fahrenheit = Double.parseDouble(scanner.nextLine());
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.printf("%.1f Fahrenheit is converted to %.1f degrees Celsius.", fahrenheit, celsius);

    }
}
