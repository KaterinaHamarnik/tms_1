package lesson7.Post;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("It's a director");
        Worker worker = new Worker("It's a worker");
        Accountant accountant = new Accountant("It's a accountant");

        accountant.printPost();
        director.printPost();
        worker.printPost();
    }
}
