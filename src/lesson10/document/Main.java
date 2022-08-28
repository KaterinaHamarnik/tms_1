package lesson10.document;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        String numberOfDoc = "5555-qwe-5678-asd-1a2b";
        document.printNumbers(numberOfDoc);
        document.replaceLetter(numberOfDoc);
        document.printLettersToUpperCase(numberOfDoc);
        document.checkIfContains(numberOfDoc);
        document.startWith(numberOfDoc);
        document.endWith(numberOfDoc);
        document.reverseOrder(numberOfDoc);
    }
}
