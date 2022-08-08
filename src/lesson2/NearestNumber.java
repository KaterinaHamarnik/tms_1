package lesson2;

public class NearestNumber {
    public static void main(String[] args) {
        double m = 19.5, n = 20.9;
        if (Math.abs(10 - m) > Math.abs(10 - n)){
            System.out.println("The nearest number is " + n);
        }
        else {
            System.out.println("The nearest number is " + m);
        }
    }
}
