package lesson7.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        System.out.print("Entre the radius of circle: ");
        circle.setRadius(scanner.nextDouble());
        circle.Square();
        circle.Perimeter();

        System.out.print("Enter the length of rectangle: ");
        rectangle.setLength(scanner.nextDouble());
        System.out.print("Enter the width of rectangle: ");
        rectangle.setWidth(scanner.nextDouble());
        rectangle.Square();
        rectangle.Perimeter();

        System.out.print("Enter the first side of triangle: ");
        triangle.setSideOne(scanner.nextDouble());
        System.out.print("Enter the second side of triangle: ");
        triangle.setSideTwo(scanner.nextDouble());
        System.out.print("Enter the third side of triangle: ");
        triangle.setSideThree(scanner.nextDouble());
        triangle.Square();
        triangle.Perimeter();

        double[] array = new double[5];
        double perimeterArray = 0;

        for (int i = 0; i < array.length; i ++){
            System.out.print("Entre the radius of circle: ");
            circle.setRadius(scanner.nextDouble());
            perimeterArray = perimeterArray + circle.Perimeter();
        }
        System.out.println("Perimeter of array: " + perimeterArray);
    }
}
