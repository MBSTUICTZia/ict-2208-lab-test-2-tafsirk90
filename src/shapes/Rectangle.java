package shapes;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "[ shapes.rectangle ]\n" +
                super.toString() +
                "Width : " +  width + "\n" +
                "Height : " + length + "\n" +
                String.format("Area      : %.2f", getArea())      + "\n" +
                String.format("Perimeter : %.2f", getPerimeter()) + "\n" +
                String.format("Area: %.2f", getArea()) + '\n' +
                String.format("Perimeter: %.2f", getPerimeter());
    }
}
