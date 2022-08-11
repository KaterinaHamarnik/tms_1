package lesson6.Computer;

public class RAM {
    String name;
    int volume;

    public RAM() {
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    void printInfo(){
        System.out.println("The name of a RAM: " + name);
        System.out.println("The volume of a RAM: " + volume);
    }
}
