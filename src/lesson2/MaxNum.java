package lesson2;

import java.util.Random;

public class MaxNum {
    public static void main(String[] args) {
        Random rand = new Random();
        int random_num = rand.nextInt(899) + 100;
        int num1 = random_num / 100;
        int num2 = (random_num / 10) % 10;
        int num3 = random_num % 10;
        if (num1 > num2 && num1 > num3) {
            System.out.println("Random number is " + random_num + " and the largest digit is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Random number is " + random_num + " and the largest digit is " + num2);
        } else {
            System.out.println("Random number is " + random_num + " and the largest digit is " + num3);
        }
    }
}
