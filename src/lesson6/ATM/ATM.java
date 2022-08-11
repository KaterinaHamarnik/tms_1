package lesson6.ATM;

public class ATM {
    int numberOfTwenties;
    int numberOfFifties;
    int numberOfHundreds;

    public ATM(int numberOfTwenties, int numberOfFifties, int numberOfHundreds) {
        this.numberOfTwenties = numberOfTwenties;
        this.numberOfFifties = numberOfFifties;
        this.numberOfHundreds = numberOfHundreds;
    }

    void addBanknotes(int numberOfTwenties, int numberOfFifties, int numberOfHundreds) {
        this.numberOfTwenties += numberOfTwenties;
        this.numberOfFifties += numberOfFifties;
        this.numberOfHundreds += numberOfHundreds;
    }

    boolean retrieveMoney(int money) {
        int hundredsToGive = amountOfBanknotesToGive(money, 100, numberOfHundreds);

        int requiredMoney = money - hundredsToGive * 100;
        int fiftiesToGive = amountOfBanknotesToGive(requiredMoney, 50, numberOfFifties);

        requiredMoney -= fiftiesToGive * 50;
        int twentiesToGive = amountOfBanknotesToGive(requiredMoney, 20, numberOfTwenties);

        int totalSumToGive = hundredsToGive * 100 + fiftiesToGive * 50 + twentiesToGive * 20;

        boolean canGiveMoney =  money == totalSumToGive;

        if (canGiveMoney){
            giveMoney(hundredsToGive, fiftiesToGive, twentiesToGive);
        } else {
            System.out.println("Unable to give required amount of money");
        }
        return canGiveMoney;
    }

    void giveMoney(int hundredsToGive, int fiftiesToGive, int twentiesToGive) {
        System.out.println("Gave hundreds: " + hundredsToGive);
        numberOfHundreds -= hundredsToGive;
        System.out.println("Gave fifties: " + fiftiesToGive);
        numberOfFifties -= fiftiesToGive;
        System.out.println("Gave twenties: " + twentiesToGive);
        numberOfTwenties -= twentiesToGive;
    }

    int amountOfBanknotesToGive(int requiredMoney, int banknote, int availableBanknotes) {
        int requiredBanknote = requiredMoney / banknote;
        return Math.min(availableBanknotes, requiredBanknote);
    }
}
