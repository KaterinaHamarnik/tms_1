package lesson10.duplicationOfLetters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = scanner.next();
        duplicationOfLetters(word);
    }

    private static void duplicationOfLetters(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            stringBuilder.append(str.charAt(i));
            stringBuilder.append(str.charAt(i));
        }
        System.out.println(stringBuilder);
    }
}
