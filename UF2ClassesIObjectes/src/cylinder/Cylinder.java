package cylinder;

public class Cylinder {
	private Circle base;
	private double height;
	private double radius;
		
	public Cylinder(double raduis, double height) {
		this.setRadius(radius);
		this.height = height;
		// crear circulo 
		setBase(this.base);
		setHeight(this.height);
	}
	//Getters y Setters
	public Circle getBase() {
		return base;
	}
	public void setBase(Circle base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		double area = (2 * Math.PI*base.getRadius() * this.height) + 2 * Math.PI * Math.pow(base.getRadius(),2);
		return area;
	}
	public double volCylinder() {
		double volume = Math.PI * Math.pow(base.getRadius(), 2)* this.height;
		return volume;
	}
	
	public boolean isGreater(Cylinder anotherCylindre) {
		boolean isGreater = false;
		if (volCylinder() > anotherCylindre.volCylinder()) {
			isGreater = true;
		}
		return isGreater;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double raduis) {
		this.radius = raduis;
	}
}
