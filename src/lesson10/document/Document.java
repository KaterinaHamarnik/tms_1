package lesson10.document;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Document {
    public void printNumbers(String doc){
        Pattern pattern = Pattern.compile("\\d{4}");
        Matcher matcher = pattern.matcher(doc);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()){
            stringBuilder.append(matcher.group());
            count++;
            if (count == 2){
                break;
            }
        }
        System.out.println(stringBuilder);
    }

    public void replaceLetter(String doc){
        System.out.println(doc.replace('a', '{'));
    }

    public void printLettersToUpperCase(String doc){
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(doc);
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()){
            stringBuilder.append(matcher.group());
        }
        System.out.println("Letters: " + stringBuilder.toString().toUpperCase());
    }

    public void checkIfContains(String doc){
        Pattern pattern = Pattern.compile("abcd|ABCD");
        Matcher matcher = pattern.matcher(doc);
        if (matcher.find()){
            System.out.println("Your documents number contains abcd or ABCD");
        } else {
            System.out.println("Your documents number doesn't contain abcd or ABCD");
        }
    }

    public void startWith(String doc){
        boolean startOfDoc = doc.startsWith("5555");
        if(startOfDoc){
            System.out.println("The document number starts with the sequence 5555");
        } else {
            System.out.println("The document number doesn't start with the sequence 5555");
        }
    }

    public void endWith(String doc){
        boolean enfOfDoc = doc.endsWith("1a2b");
        if(enfOfDoc){
            System.out.println("The document number ends with the sequence 1a2b");
        } else {
            System.out.println("The document number doesn't end with the sequence 1a2b");
        }
    }
    public void reverseOrder(String doc){
        StringBuilder stringBuilder = new StringBuilder(doc);
        System.out.println("Reverse order of document: " + stringBuilder.reverse());
    }

}
