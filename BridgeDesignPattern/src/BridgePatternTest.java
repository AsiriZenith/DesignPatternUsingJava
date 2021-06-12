public class BridgePatternTest {

    public static void main(String[] args) {
        Shape tri1 = new Triangle(new RedColor());
        tri1.applyColor();

        Shape pent1 = new Pentagon(new RedColor());
        pent1.applyColor();

        Shape tri2 = new Triangle(new GreenColor());
        tri2.applyColor();

        Shape pent2 = new Pentagon(new GreenColor());
        pent2.applyColor();
    }
}
