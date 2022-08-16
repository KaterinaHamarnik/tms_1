package lesson7.Shape;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    void Square() {
        double square = this.length * this.width;
        System.out.println("Square of rectangle: " + square);
    }

    @Override
    double Perimeter() {
        double perimeter = (this.length + this.width) * 2;
        System.out.println("Perimeter of rectangle: " + perimeter);
        return perimeter;
    }
}
