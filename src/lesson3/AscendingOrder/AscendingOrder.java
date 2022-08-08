package lesson3.AscendingOrder;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter size of array: ");
        size = scanner.nextInt();
        int[] array = new int[ size ];
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + "-number: ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag == false) {
            System.out.println("It's not ascending order!");
        } else {
            System.out.println("It's ascending order!");
        }
    }
}

