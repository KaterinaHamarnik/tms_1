package lesson9.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayWorker {

    private int arrayLength;
    Scanner scanner = new Scanner(System.in);

    public int getArrayLength() {
        return arrayLength;
    }

    public void setArrayLengthFromUserInput() {
        System.out.print("Enter size of array: ");
        try {
            this.arrayLength = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong size of array! ");
        }
    }

    public void createAndFillArray(int size) {
        int[] array = new int[size];
        try {
            fillInOrder(array);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Wrong enter size of array or number!");
        }
    }

    private void fillInOrder(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print("Enter the " + (i+1) + " number: ");
            array[i] = scanner.nextInt();
        }
    }


   public void fillWithRandomInBounds(int size){
        int[] array = new int[size];
        System.out.print("Enter min value of array: ");
        int minValue = scanner.nextInt();
        System.out.print("Enter max value of array: ");
        int maxValue = scanner.nextInt();
        try {
            fillWithRandomValue(array, minValue, maxValue);
        } catch (Exception e){
            System.out.println("Error when filling array with random numbers. Filling array with zeroes");
        } finally {
            for (int i : array) {
                System.out.println(i);
            }
        }
    }

    private void fillWithRandomValue(int[] array, int minValue, int maxValue) throws Exception {
       if (maxValue > minValue) {
           for (int i = 0; i <= array.length - 1; i++) {
               array[i] = minValue + (int) (Math.random() * ((maxValue - minValue)) + 1);
           }
       } else {
           throw new Exception("Min value can't be larger than max value");
       }
    }

    public void fillInManually(int size){
        int[] array = new int[size];
        try {
            System.out.print("Enter number system: ");
            int numberSystem = scanner.nextInt();
            int id;
            int count = 0;
            do {
                System.out.print("Enter index of array: ");
                id = scanner.nextInt();
                System.out.print("Enter number: ");
                array[id] = scanner.nextInt(numberSystem);
                count++;
            } while (count < size);
        } catch (InputMismatchException e){
            System.out.println("Wrong entering number");
        } catch (IllegalArgumentException e){
            System.out.println("Number system must be from 2 to 36");
        }
        for (int i: array) {
            System.out.println(i);
        }
    }
}
