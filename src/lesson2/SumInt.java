package lesson2;

import java.util.Scanner;

public class SumInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        while (true) {
            System.out.print("Enter the first number: ");
            if (scanner.hasNextInt()){
                break;
            }else{
                System.out.println("Error. Try again ");
                scanner.nextLine();
            }
        }
        num1 = scanner.nextInt();
        while (true) {
            System.out.print("Enter the second number: ");
            if (scanner.hasNextInt()){
                break;
            }else{
                System.out.println("Error. Try again ");
                scanner.nextLine();
            }
        }
        num2 = scanner.nextInt();
        System.out.println("lesson1.sum2.lesson1.sun3.Sum is " + (num1+num2));
    }
}
