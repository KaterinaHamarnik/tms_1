package lesson2_2.PositiveOrNegative;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.println(number % 2 == 0 ? "It's positive number" : "It's negative number");
    }
}
