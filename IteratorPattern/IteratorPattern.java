package IteratorPattern;

/**
 * Iterator
 */
interface Iterator {
    public boolean hasNext();

    public Object next();
}

/**
 * Container
 */
interface Container {
    public Iterator getIterator();
}

/**
 * NameRepository
 */
class NameRepository implements Container {

    public String names[] = { "Robert", "John", "Julie", "Lora" };

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }

    }
}

/**
 * IteratorPattern
 */
public class IteratorPattern {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator itr = nameRepository.getIterator(); itr.hasNext();) {
            String name = (String) itr.next();
            System.out.println("Name: " + name);
        }
    }
}