package lesson6.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computerOne = new Computer(2000, "HP");
        computerOne.printInfo();
        Computer computerTwo = new Computer(
                2000,
                "HP",
                new RAM("Corsair", 200),
                new HDD("Sony", 200, "Internal")
                );
        computerTwo.printInfo();
    }
}
