package lesson9.exception;

public class Main {
    public static void main(String[] args) {
        ArrayWorker arrayWorker = new ArrayWorker();
        arrayWorker.setArrayLengthFromUserInput();
        arrayWorker.createAndFillArray(arrayWorker.getArrayLength());
        arrayWorker.fillWithRandomInBounds(arrayWorker.getArrayLength());
        arrayWorker.fillInManually(arrayWorker.getArrayLength());
    }
}
