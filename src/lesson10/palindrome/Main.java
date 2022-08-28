package lesson10.palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String str = scanner.next();
        palindrome(str);
    }

    private static void palindrome(String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        if (word.equals(stringBuilder.reverse().toString())){
            System.out.println("It's palindrome!");
        } else {
            System.out.println("It's not palindrome!");
        }
    }
}
