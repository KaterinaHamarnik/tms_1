package lesson6.Computer;

public class HDD {
    String name;
    int volume;
    String type;

    public HDD() {
    }

    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }
    void printInfo(){
        System.out.println("The name of a HDD: " + name);
        System.out.println("The volume of a HDD: " + volume);
        System.out.println("The type of a HDD: " + type);
    }
}
