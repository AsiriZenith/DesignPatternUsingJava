package AbstractFactoryPattern2;
/**
 * AbstractFactoryPattern2
 */

public class AbstractFactoryPattern2 {

    public static void main(String[] args) {
        
        IAnimal animal = null;
        AnimalFactory animalFactory = null;
        String speakSound = null;

        // Create the Sea Factory object by passing the factory type as Sea
        animalFactory = AnimalFactory.CreateAnimalFactory("Sea");
        System.out.println("Animal Factory type : " + animalFactory.getClass().getSimpleName());

        // Get Octopus Animal object by passing the animal type as Octopus
        animal = animalFactory.GetAnimal("Octopus");
        System.out.println("Animal Type : " + animal.getClass().getSimpleName());
        speakSound = animal.speak();
        System.out.println(animal.getClass().getSimpleName() + " Speak : " + speakSound);

        System.out.println("--------------------------");

        // Create Land Factory object by passing the factory type as Land
        animalFactory = AnimalFactory.CreateAnimalFactory("Land");
        System.out.println("Animal Factory type : " + animalFactory.getClass().getSimpleName());

        // Get Lion Animal object by passing the animal type as Lion
        animal = animalFactory.GetAnimal("Lion");
        System.out.println("Animal Type : " + animal.getClass().getSimpleName());
        speakSound = animal.speak();
        System.out.println(animal.getClass().getSimpleName() + " Speak : " + speakSound);

        System.out.println("--------------------------");

        // Get Cat Animal object by passing the animal type as Cat
        animal = animalFactory.GetAnimal("Cat");
        System.out.println("Animal Type : " + animal.getClass().getSimpleName());
        speakSound = animal.speak();
        System.out.println(animal.getClass().getSimpleName() + " Speak : " + speakSound);
    }
}