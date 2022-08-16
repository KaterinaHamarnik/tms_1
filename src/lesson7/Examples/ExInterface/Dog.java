package lesson7.Examples.ExInterface;

public class Dog implements Voice{
    @Override
    public void doVoice() {
        System.out.println("Woof");
    }
}
