package AbstractFactoryPattern2;

public abstract class AnimalFactory {
    
    public abstract IAnimal GetAnimal(String AnimalType);

    public static AnimalFactory CreateAnimalFactory(String FactoryType)
        {
            if (FactoryType.equals("Sea"))
                return new SeaAnimalFactory();
            else
                return new LandAnimalFactory();
        }
}
