package lesson7.Examples.ExInterface;

public class Cat implements Voice{
    @Override
    public void doVoice() {
        System.out.println("Meow");
    }
}
