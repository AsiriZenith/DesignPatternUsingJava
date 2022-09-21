package AbstractFactoryPattern2;

public class LandAnimalFactory extends AnimalFactory {
    @Override
    public IAnimal GetAnimal(String AnimalType)
        {
            if (AnimalType.equals("Dog"))
            {
                return new Dog();
            }
            else if (AnimalType.equals("Cat"))
            {
                return new Cat();
            }
            else if (AnimalType.equals("Lion"))
            {
                return new Lion();
            }
            else
                return null;
        }
}
