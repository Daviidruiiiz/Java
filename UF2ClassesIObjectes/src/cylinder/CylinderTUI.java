package cylinder;

public class CylinderTUI {
	public static void main(String[] args) {
	Cylinder cylinder = new Cylinder(2.31, 2.31);
	Cylinder cylinder2 = new Cylinder(2.32, 3.71);

	System.out.println("Height of cylinder: " + cylinder.getHeight());;
	System.out.println("Base of cylinder: " + cylinder.getBase().getRadius());
	System.out.println("Volume of cylinder: " + cylinder.volCylinder());
	
	System.out.println("Height of cylinder2: " + cylinder2.getHeight());;
	System.out.println("Base of cylinder2: " + cylinder2.getBase().getRadius());
	System.out.println("Volume of cylinder2: " + cylinder2.volCylinder());
	
	System.out.println("Is cylinder bigger cylinder2 " + cylinder.isGreater(cylinder2));
	}
}
