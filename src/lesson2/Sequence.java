package lesson2;

public class Sequence {
    public static void main(String[] args) {
        int n = 1, m;
        for (int i = 0; i < 20; i++) {
            m = (int) Math.pow(2,n);
            System.out.print(m + " ");
            n++;
        }
    }
}
