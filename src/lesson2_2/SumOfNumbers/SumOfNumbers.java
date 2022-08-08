package lesson2_2.SumOfNumbers;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter tne number: ");
        int number = scanner.nextInt();
        int sum = 0;
        if (number > 0){
            for (int i = 1; i <= number; i++){
                sum +=i;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
