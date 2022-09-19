/**
 * Color
 */
interface Color {
    public void applyColor();
}

/**
 * RedColor
 */
class RedColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("red.");
    }

}

/**
 * GreenColor
 */
class GreenColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("green.");
    }

}

/**
 * Shape
 */
abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}

/**
 * Triangle
 */
class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }

}

/**
 * Pentagon
 */
class Pentagon extends Shape {

    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }

}

/**
 * BridgePattern1
 */
public class BridgePattern1 {

    public static void main(String[] args) {

        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }

}
