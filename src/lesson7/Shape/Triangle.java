package lesson7.Shape;

public class Triangle extends Shape{
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    @Override
    void Square() {
        double semiPerimeter = (this.sideOne + this.sideTwo + this.sideThree) / 2;
        double square = Math.sqrt(semiPerimeter * (semiPerimeter - this.sideOne) * (semiPerimeter - this.sideTwo) * (semiPerimeter - this.sideThree));
        System.out.println("Square of triangle: " + square);
    }

    @Override
    double Perimeter() {
        double perimeter = this.sideOne + this.sideTwo + this.sideThree;
        System.out.println("Perimeter of triangle: " + perimeter);
        return perimeter;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }
}
