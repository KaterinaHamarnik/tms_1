package lesson4.TwoDimensionalArray;

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] nameArray = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.print("Enter the number: ");
        number = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < nameArray.length; i++){
            for (int j = 0; j < nameArray[i].length; j++){
                nameArray[i][j] = random.nextInt(9);
                System.out.print(nameArray[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 0; i < nameArray.length; i++){
            for (int j = 0; j < nameArray[i].length; j++){
                nameArray[i][j] += number;
                System.out.print(nameArray[i][j] + " ");
                sum = sum + nameArray[i][j];
            }
            System.out.println(" ");
        }
        System.out.println("Sum is " + sum);
    }
}
