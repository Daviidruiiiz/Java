package circle;

public class Circle {
	private double radius;
	
	public void circle() {
		this.radius = 0;
	}
	
	//constructor
	public Circle(double radius) {
		this.radius = radius;
		setRadius(this.radius);
	}
	
	// Getters & Setters
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Methods
	public double area() {
		double resArea = Math.PI * Math.pow(radius,2);
		return resArea;
	}
	
	public double perimeter() {
		double resPerimeter = radius * 2;
		return resPerimeter;
	}
	
	public boolean isGreater(Circle anotherCircle) {
		boolean isGreater = false;
		if (this.radius > anotherCircle.getRadius()) {
			isGreater = true;
		}
		return isGreater;
		// Se puede quitar toda la funcion de arriba y solo poner  ⬇
		// return this.radius > anotherCircle.getRadius()
	}
}
