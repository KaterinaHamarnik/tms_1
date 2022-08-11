package lesson6.Cats;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        cat.name = scanner.next();
        System.out.print("Enter age: ");
        cat.age = scanner.nextInt();
        System.out.print("Enter food: ");
        cat.food = scanner.nextInt();
        System.out.println(cat.Feeding(cat.food));
    }
}
