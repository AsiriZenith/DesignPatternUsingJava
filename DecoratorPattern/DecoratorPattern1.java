/**
 * Car
 */
interface Car {
    public void assemble();
}

/**
 * BasicCar
 */
class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

}

/**
 * CarDecorator
 */
class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}

/**
 * SportsCar
 */
class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.print("Adding features of Sports Car.");
    }
}

/**
 * LuxuryCar
 */
class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.print("Adding features of Luxury Car.");
    }
}

/**
 * DecoratorPattern1
 */
public class DecoratorPattern1 {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportLuxuryCar.assemble();
    }
}