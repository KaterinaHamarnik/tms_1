package lesson7.Examples.ExAbstractClass;

public class Mac extends Computer {
    private String name;

    @Override
    void getClassName() {
        System.out.println("I'm Mac");
    }
}
