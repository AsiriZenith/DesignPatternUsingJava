package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Observer
 */
abstract class Observer {
    protected Subject subject;

    public abstract void update();
}

/**
 * Subject
 */
class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}

/**
 * BinaryObserver
 */
class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(" Binary String: " + Integer.toBinaryString(subject.getState()));
    }

}

/**
 * OctaObserver
 */
class OctaObserver extends Observer {

    public OctaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(" Octal String: " + Integer.toBinaryString(subject.getState()));
    }

}

/**
 * HexaObserver
 */
class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(" Hex String: " + Integer.toBinaryString(subject.getState()));
    }
}

public class ObserverPattern {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctaObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
