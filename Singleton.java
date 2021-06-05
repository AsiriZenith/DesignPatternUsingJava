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
 * Singleton2 -Thread safe Singleton method-
 */
class Singleton2 {

    private volatile static Singleton2 uniqeInstance;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (uniqeInstance == null) {
            synchronized (Singleton2.class){
                if (uniqeInstance==null) {
                    uniqeInstance = new Singleton2();
                }
            }
        }
        return uniqeInstance;
    }

    public void showSomeText() {
        System.out.println("Singleton 2");
    }
    
}

/**
 * class Singleton{

 */
class Singleton{

    public static void main(String[] args) {
        Singleton2 obj;
        obj = Singleton2.getInstance();
        obj.showSomeText();
    }
    
}
