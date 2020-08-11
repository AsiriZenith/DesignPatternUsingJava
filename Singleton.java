import java.io.Console;

class Singleton1{
    
    private Singleton1(){}

    //Obtaining a reference to the console. 
    Console con = System.console();

    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }

    public void showSomeText() {
        System.out.println("Singleton 1");
    }

}

/**
 * class Singleton{

 */
class Singleton{

    public static void main(String[] args) {
        Singleton1 obj;
        obj = Singleton1.getInstance();
        obj.showSomeText();
    }
    
}
