package lesson7.Shape;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    void Square() {
        double square = 3.14 * Math.pow(this.radius, 2);
        System.out.println("Square of circle: " + square);
    }

    @Override
    double Perimeter() {
        double perimeter = 2 * 3.14 * this.radius;
        System.out.println("Perimeter of circle: " + perimeter);
        return perimeter;
    }
}
