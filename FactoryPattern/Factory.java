
interface Mamel{
    void drinkMilk();
}

class Human implements Mamel{
    public void drinkMilk() {
        System.out.println("Human Drinking");
    }
}

class Monkey implements Mamel{
    public void drinkMilk() {
        System.out.println("Monkey Drinking");        
    }
}

class Factory{

    public static void main(final String[] args) {
        Mamel m = MamelFactory("Human");
        m.drinkMilk();
    }

    public static Mamel MamelFactory(String m) {

        if (m == "Human"){
            return new Human();
        }
        else if (m=="Monkey") {
            return new Monkey();
        } else {
            System.out.println("Nothing Match this String value");
        }
        return null;
    }
}




