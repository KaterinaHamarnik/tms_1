package lesson3.NullElements;

import java.util.Scanner;

public class NullElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array: ");
        n = scanner.nextInt();
        int[] array = new int[n];
        int nullElement = 0;
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter " + i + "-number: ");
            array[i] = scanner.nextInt();
            if (array[i] == 0) {
                nullElement++;
            }
        }
        System.out.println("Null elements are " + nullElement);
    }
}
