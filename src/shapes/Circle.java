package Shapes;

public class Circle extends Shape{
    protected double radius;
    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius *  3.1416;
    }
    public double getPerimeter() {
        return 3.1416 * 2 * radius;
    }

    @Override
    public String toString() {
        return "[ Circle ]\n" +
                super.toString()  +
                "Radius : " + radius + "\n" +
                String.format("Area         : %.2f", getArea())      + "\n" +
                String.format("Circumference: %.2f", getPerimeter());
    }
}
