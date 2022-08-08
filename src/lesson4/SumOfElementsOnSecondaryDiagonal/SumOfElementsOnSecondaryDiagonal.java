package lesson4.SumOfElementsOnSecondaryDiagonal;

import java.util.Random;

public class SumOfElementsOnSecondaryDiagonal {
    public static void main(String[] args) {
        int[][] nameArray = new int[3][3];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < nameArray.length; i++) {
            for (int j = 0; j < nameArray[i].length; j++) {
                nameArray[i][j] = random.nextInt(9);
                System.out.print(nameArray[i][j] + " ");
            }
            System.out.println(" ");
        }

        /*for (int i = 0; i < nameArray.length; i++) {
            for (int j = 0; j < nameArray[i].length; j++) {
                if(i + j == nameArray.length - 1) {
                    sum = sum + nameArray[i][j];
                }
            }
        }*/
        int counter = nameArray.length - 1;
        for (int i = 0; i < nameArray.length; i++) {
            for (int j = 0; j < nameArray[i].length; j++) {
                if(j == counter) {
                    sum = sum + nameArray[i][j];
                    counter --;
                }
            }
        }
        System.out.println(sum);
    }

}
