package lesson2;

public class random {
    public static void main(String[] args) {
        int n = 1;
        int a = (int) (Math.random()*(n+2)) - n;
        System.out.println(a);
    }
}
