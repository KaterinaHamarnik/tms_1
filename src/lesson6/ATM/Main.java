package lesson6.ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(42, 30, 25);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter amount: ");
            int money = scanner.nextInt();
            atm.retrieveMoney(money);
        }
    }
}
