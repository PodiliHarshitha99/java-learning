Shapes.java


package openClosePrinciple;

public interface Shapes {
	
  double calculateArea();

}

Circle.java


package openClosePrinciple;

public class Circle implements Shapes{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		
		return Math.PI * radius * radius;
	}

}
