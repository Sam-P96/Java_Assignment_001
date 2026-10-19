package Assignment_1_2;

import java.util.Scanner;

public class Assignment_001_2_003 {
   /* 1 leviskä = 20 naula
    1 naula = 32 luoti
    1 luoti is 12.28 grams*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter weight in grams: ");
        double grams = Double.parseDouble(scanner.nextLine());

        double totalLuoti = grams / 13.28;

        int leviskä = (int) (totalLuoti / (20*32));
        double remaining = totalLuoti - leviskä * (20*32);

        int naula = (int) (remaining/32);

        double luoti = remaining - naula * 32;
        System.out.printf("%.0f grams is %d leviskä, %d naula, and %.2f luoti.", grams, leviskä, naula, luoti);
    }
}

/*I did not enjoy doing the math. But I guess I learned some new stuff cus of it.*/
