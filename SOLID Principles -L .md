Liskov’s Substitution Principle:

- This principle states that “Derived or child classes must be substitutable for their base or parent classes”.
- In other words, if class A is a subtype of class B, then we should be able to replace B with A without interrupting the behavior of the program.


ICar.java


package liskovSubstitutionPrinciple;
public interface ICar {
  
  public void getCar();

}


ElectricCar.java


package liskovSubstitutionPrinciple;
public class ElectricCar implements ICar{
	
  public void getCar() {
    System.out.println("Tesla or Cybertruck");
		
  }

}


LuxuryCar.java


package liskovSubstitutionPrinciple;
public class LuxuryCar implements ICar{

  @Override
    public void getCar() {
		System.out.println("Audi");
		
  }

}


SportsCar.java


package liskovSubstitutionPrinciple;
public class SportsCar implements ICar{

	@Override
    public void getCar() {
		System.out.println("Mustang");
		
	}

}


MainClass.java


package liskovSubstitutionPrinciple;
public class MainClass {
	
	public static void main(String[] args) {
		ICar car = new SportsCar();
		car.getCar();
	}

	
}


