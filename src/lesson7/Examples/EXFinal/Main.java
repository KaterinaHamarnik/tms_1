package lesson7.Examples.EXFinal;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Orange orange = new Orange();

        apple.setTaste("Sour");
        banana.setTaste("Sweet");
        orange.setTaste("Sweet");

        apple.getTaste();
        banana.getTaste();
        orange.getTaste();
    }
}
