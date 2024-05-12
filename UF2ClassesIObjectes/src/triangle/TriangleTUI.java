package triangle;

public class TriangleTUI {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(2.53, 4.67, 6.78);
		
		System.out.println(triangle.perimeterTriangle());
		System.out.println(triangle.areaTriangle());
	}
}
