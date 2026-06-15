package shapes;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    protected String fill;
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        if(filled) fill = "Yes";
        else fill = "No";
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString() {
        return "Color : " + color + "\n" +
                "Filled : " + fill + "\n";
    }
}
