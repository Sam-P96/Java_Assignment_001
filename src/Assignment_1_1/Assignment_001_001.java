package Assignment_1_1;

import java.util.Scanner;

public class Assignment_001_001 {
    public static void main(String[] args) {
        System.out.println("Hello there");
        asksName();
    }

    public static void asksName() {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Please enter your name: ");
        name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
