package lesson10.maxAndMinWord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        maxWord(str);
        minWord(str);
    }

    private static void maxWord(String str){
        String[] array = str.split(" ");
        String max = array[0];
        for (String s : array) {
            if (max.length() <= s.length()) {
                max = s;
            }
        }
        System.out.println("Max word: " + max);
    }

    private static void minWord(String str){
        String[] array = str.split(" ");
        String min = array[0];
        for (String s : array) {
            if (min.length() >= s.length()) {
                min = s;
            }
        }
        System.out.println("Min word: " + min);
    }
}
