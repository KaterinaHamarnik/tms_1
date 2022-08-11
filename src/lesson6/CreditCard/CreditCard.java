package lesson6.CreditCard;

public class CreditCard {
    int accountNumber;
    int currentAccountBalance;

    void sum(int balancePlus){
        currentAccountBalance += balancePlus;
    }

    void minus(int balanceMinus){
        currentAccountBalance -= balanceMinus;
    }

    void info(){
        System.out.println("An account number: " + accountNumber);
        System.out.println("A current account balance: " + currentAccountBalance);
    }
}

