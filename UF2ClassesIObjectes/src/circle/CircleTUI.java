package circle;

public class CircleTUI {
	public static void main(String[] args) {
	Circle circle = new Circle(2.31);
	Circle circle2 = new Circle(3.71);

	System.out.println("Radius of circle: " + circle.getRadius());;
	System.out.println("Perimter of circle: " + circle.perimeter());
	System.out.println("Area of circle: " + circle.area());
	
	System.out.println("Radius of circle2: " + circle2.getRadius());;
	System.out.println("Perimeter of circle2: " + circle2.perimeter());
	System.out.println("Area of circle2: " + circle2.area());
	
	System.out.println("Is circle bigger circle2 " + circle.isGreater(circle2));
	}
}
