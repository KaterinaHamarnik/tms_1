package lesson7.Post;

public class Accountant extends Person implements IntPost{
    public Accountant(String post) {
        super(post);
    }

    @Override
    public void printPost() {
        System.out.println("It's accountant");
    }
}
