package Assignment_1_3;

import java.util.Scanner;


public class Assignment_001_3_002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter a binary number, keep it short: ");
        String entry = scanner.nextLine();
        String reverse = new StringBuilder(entry).reverse().toString();
//        System.out.println(reverse);
        int entryLength = entry.length();
        int i;
        double startingNumber = 0;
        for (i = 0; i < entryLength; i++) {
            int power = i;
            int onOff = Integer.parseInt(String.valueOf(reverse.charAt(i)));
            startingNumber += onOff * (int) Math.pow(2, i);
        }
        System.out.printf(entry + " is " + startingNumber);

    }


}
