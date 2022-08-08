package lesson4.Ex;

import java.util.Random;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        int[][] nameArray = new int[3][3];
        Random random = new Random();
        int sum = 0;
        int num = 0;
        int n = 0;
        for (int i = 0; i < nameArray.length; i++) {
            for (int j = 0; j < nameArray[i].length; j++, num++) {
                nameArray[i][j] = random.nextInt(9);
                System.out.print(nameArray[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < nameArray.length; i++) {
            sum += nameArray[i][i];
        }
        System.out.println(sum);
    }
}
