package lesson6.CreditCard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard[] arrayOfCreditCard = new CreditCard[3];
        for (int i = 0; i < arrayOfCreditCard.length; i++){
            arrayOfCreditCard[i] = new CreditCard();
            System.out.print("Enter an account number of " + i + " card: ");
            arrayOfCreditCard[i].accountNumber = scanner.nextInt();
            System.out.print("Enter a current account balance of " + i + " card: ");
            arrayOfCreditCard[i].currentAccountBalance = scanner.nextInt();
        }
        int accountRefill;
        System.out.print("Enter a account refill: ");
        accountRefill = scanner.nextInt();
        arrayOfCreditCard[0].sum(accountRefill);
        arrayOfCreditCard[1].sum(accountRefill);
        int withdrawalFromAccount;
        System.out.print("Enter a withdrawal from the account: ");
        withdrawalFromAccount = scanner.nextInt();
        arrayOfCreditCard[2].minus(withdrawalFromAccount);
        for (int i = 0; i < arrayOfCreditCard.length; i++){
            arrayOfCreditCard[i].info();
        }
    }
}
