package lesson7.Post;

public class Worker extends Person implements IntPost{
    public Worker(String post) {
        super(post);
    }

    @Override
    public void printPost() {
        System.out.println("It's worker");
    }
}
