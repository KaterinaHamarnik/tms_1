package lesson2;

public class AscendingOrder {
    public static void main(String[] args) {
        int num1 = 7, num2 = 9, num3 = 5;
        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else if (num3 < num2 && num3 < num1) {
            if (num2 < num1) {
                System.out.println(num3 + " " + num2 + " " + num1);
            } else {
                System.out.println(num3 + " " + num1 + " " + num2);
            }
        }

    }
}
