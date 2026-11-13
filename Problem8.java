class Vericale{
    protected String brand;
    protected String fuelType;

    public Vericale(String brand, String fuelType){
        this.brand = brand;
        this.fuelType = fuelType;
    }
    
    public void describe(){
        System.out.println(brand + " runs on " + fuelType);
    }
}
class ElectricCar extends Vericale{

    public ElectricCar(String brand){
        super(brand, "Electric");
    }
}
class PetrolCar extends Vericale{

    public PetrolCar(String brand){
        super(brand, "Petrol");
    }
}

public class Problem8 {
    public static void main(String [] args){
        Vericale v1 = new ElectricCar("Tesla");
        Vericale v2 = new PetrolCar("Toyota");
        v1.describe();
        v2.describe();
    }
}