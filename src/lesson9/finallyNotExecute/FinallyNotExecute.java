package lesson9.finallyNotExecute;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyNotExecute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
        } catch (InputMismatchException e){
            System.exit(0);
        } finally {
            System.out.println("Not error");
        }
    }
}
