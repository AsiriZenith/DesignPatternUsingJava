/**
 * Shape
 */
interface Shape {
    void draw();
}

/**
 * RoundedRectangle
 */
class RoundedRectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }

}

/**
 * RoundedSquare
 */
class RoundedSquare implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }

}

/**
 * Rectangle
 */
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}

/**
 * Square
 */
class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}

/**
 * AbstractFactory
 */
abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
}

/**
 * ShapeFactory
 */
class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

}

/**
 * RoundedShapeFactory
 */
class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }

}

/**
 * FactoryProducer
 */
class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();

        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();
    }
}
