package lesson2;

import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = num; 0 < i; i --){
            if (num%i == 0)
                System.out.println(i);
        }
    }
}
