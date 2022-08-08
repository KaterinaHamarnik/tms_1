package lesson2_2.Temperature;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temperature = scanner.nextInt();
        if (temperature > -5){
            System.out.println("Warm");
        } else if ((temperature >= -5) && (temperature > -20)) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }
}
