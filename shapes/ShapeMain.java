package shapes;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take ONLY one input line
        String[] data = sc.nextLine().split(" ");

        String type = data[0].toUpperCase();
        String color = data[1];
        boolean filled = Boolean.parseBoolean(data[2]);

        Shape shape = null;

        if (type.equals("RECTANGLE")) {

            double w = Double.parseDouble(data[3]);
            double l = Double.parseDouble(data[4]);

            shape = new Rectangle(color, filled, w, l);

        }
        else if (type.equals("CIRCLE")) {

            double r = Double.parseDouble(data[3]);

            shape = new Circle(color, filled, r);
        }

        System.out.println(shape);

        sc.close();
    }
}