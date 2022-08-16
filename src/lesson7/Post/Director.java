package lesson7.Post;

public class Director extends Person implements IntPost{
    public Director(String post) {
        super(post);
    }

    @Override
    public void printPost() {
        System.out.println("It's director");
    }
}
