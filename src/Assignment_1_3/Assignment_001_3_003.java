package Assignment_1_3;

import java.util.Scanner;

public class Assignment_001_3_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter starting number: ");
        int starter = Integer.parseInt(scanner.nextLine());
        System.out.printf("Enter ending number: ");
        int ender = Integer.parseInt(scanner.nextLine());
        int n;
        for (n = starter; n < ender + 1; n++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.println(n + (isPrime ? " is prime" : " is not prime"));
            }
        }
    }

    // Please not more math.. 😢