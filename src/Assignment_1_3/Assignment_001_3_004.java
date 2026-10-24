package Assignment_1_3;

import java.util.Scanner;

public class Assignment_001_3_004 {
    public static void main(String[] args) {
        int pointCountdown = 10;

        while (pointCountdown != 0) {
            int a = (int) (Math.random() * 10) + 1;
            int b = (int) (Math.random() * 10) + 1;
            int c = a * b;
            Scanner scanner = new Scanner(System.in);

            System.out.println(a + " * " + b + " = ");
            int entry = Integer.parseInt(scanner.nextLine());

            if (entry == c) {
                pointCountdown -= 1;
                System.out.println("Goodjob, " + pointCountdown + " questions left!");
            } else {
                pointCountdown = 10;
                System.out.println("You suck, back to " + pointCountdown + " questions!");
            }
        }

        System.out.println("Exercise Over!");
    }
}

// I still dont like math.