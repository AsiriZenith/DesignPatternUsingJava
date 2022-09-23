package VisitorPattern;

/**
 * ComputerPart
 */
interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}

/**
 * KeyBoard
 */
class KeyBoard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}

/**
 * Monitor
 */
class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}

/**
 * Mouse
 */
class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}

/**
 * Computer
 */
class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[] { new Mouse(), new KeyBoard(), new Monitor() };
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }

}

/**
 * ComputerPartVisitor
 */
interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(KeyBoard keyBoard);

    public void visit(Monitor monitor);
}

/**
 * ComputerPartDisplayVisitor
 */
class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("Displaying KeyBoard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }

}

public class VisitorPattern {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
