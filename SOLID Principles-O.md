Open/Close Principle:

- This principle states that software entities like Modules, classes, functions, etc should be open for extension but closed for modification.
- This means that one should be able to extend the behaviour of a class without modifying it.




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



Rectangle.java


package openClosePrinciple;
public class Rectangle implements Shapes{
	
 private double width;
 private double height;
	
	public Rectangle (double width,double height ) {
		this.width = width;
		this.height = height;
		
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

}


Square.java


package openClosePrinciple;

public class Square implements Shapes{

	private double length;
	public Square(double length) {
		
		this.length = length;
		
	}
	
	@Override
	public double calculateArea() {
		
		return length * length;
	}

}


package openClosePrinciple;

public class Area {
	public double calculateArea(Shapes shape) {
		return shape.calculateArea();

	}

}

AreaCalculator.java 


package openClosePrinciple;

public class AreaCalculator {
	public static void main(String[] args) {
		Area area = new Area();

		Shapes circle = new Circle(5);
		Shapes rectangle = new Rectangle(4, 6);
		Shapes triangle = new Square(4);

		System.out.println("Area of Circle: " + area.calculateArea(circle));
		System.out.println("Area of Rectangle: " + area.calculateArea(rectangle));
		System.out.println("Area of Triangle: " + area.calculateArea(triangle));
	}
}



