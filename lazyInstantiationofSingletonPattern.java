
/**
 * InnerlazyInstantiationofSingletonPattern
 */
class SingletonClass {

    private SingletonClass(){}

    private static SingletonClass s1;

    public static SingletonClass getInstance() {
        if (s1 instanceof SingletonClass) {
            System.out.println("Already have SingletonClass object");
        }
        else{
            System.out.println("Newly created");
            s1 = new SingletonClass();
            return s1;
        }
        return s1;
    }
    
    public void print() {
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}



public class lazyInstantiationofSingletonPattern{

    public static void main(final String[] args) {
        SingletonClass.getInstance();
        SingletonClass.getInstance();
        SingletonClass s = SingletonClass.getInstance();
        s.print();
    }
    
}