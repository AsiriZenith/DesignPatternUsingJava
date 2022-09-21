package AbstractFactoryPattern2;

public class SeaAnimalFactory extends AnimalFactory {
    @Override
    public IAnimal GetAnimal(String AnimalType)
        {
            if (AnimalType.equals("Shark"))
            {
                return new Shark();
            }
            else if (AnimalType.equals("Octopus"))
            {
                return new Octopus();
            }
            else
                return null;
        }
}
