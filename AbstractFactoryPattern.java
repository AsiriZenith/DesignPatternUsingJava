/**
 * Abstract Factory Design Pattern
 */

abstract class AbstractComputer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
     
    @Override
    public String toString(){
        return "RAM = "+this.getRAM()+", HDD ="+this.getHDD()+", CPU ="+this.getCPU();
    }
}
 
class AbstractPC extends Computer {
    private String ram;
    private String hdd;
    private String cpu;
     
    public AbstractPC(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }
 
    @Override
    public String getHDD() {
        return this.hdd;
    }
 
    @Override
    public String getCPU() {
        return this.cpu;
    }
}

class AbstractServer extends Computer {
    private String ram;
    private String hdd;
    private String cpu;
     
    public AbstractServer(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }
 
    @Override
    public String getHDD() {
        return this.hdd;
    }
 
    @Override
    public String getCPU() {
        return this.cpu;
    }
}

/**
 * Abstract Factory Interface
 */
interface ComputerAbstractFactory {
    public Computer createComputer();
}

class PCFactory implements ComputerAbstractFactory {
    private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram, String hdd, String cpu){
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer createComputer() {
		return new PC(ram,hdd,cpu);
	}
}

class ServerFactory implements ComputerAbstractFactory {
    private String ram;
	private String hdd;
	private String cpu;
	
	public ServerFactory(String ram, String hdd, String cpu){
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new Server(ram,hdd,cpu);
	}
}

class A_ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc = A_ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz")); 
		Computer server = A_ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config :: "+pc);
		System.out.println("AbstractFactory Server Config :: "+server);
	}
}


