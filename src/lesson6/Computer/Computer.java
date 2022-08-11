package lesson6.Computer;

public class Computer {
    int cost;
    String model;
    RAM ram = new RAM();
    HDD hdd = new HDD();
    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    public Computer(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }
    void printInfo() {
        System.out.println("The cost of a computer: " + cost);
        System.out.println("The model of a computer: " + model);
        ram.printInfo();
        hdd.printInfo();
    }
}
