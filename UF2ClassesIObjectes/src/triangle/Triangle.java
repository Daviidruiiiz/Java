package triangle;
	
public class Triangle {
    private int side1, side2, side3;

    public Triangle() {
        this.side1 = 3;
        this.side2 = 4;  // Side2 será la base
        this.side3 = 5;
    }

    // Get
    public double side1() {
        return this.side1;
    }
    public double side2() {
        return this.side2;
    }
    public double side3() {
        return this.side3;
    }

    // Set (topdiff)
    public Triangle(double d, double e, double f) {
        this.side1 = (int) d;
        this.side2 = (int) e;
        this.side3 = (int) f;
    }

    public int perimeterTriangle() {
        int perimeter = this.side1 + this.side2 + this.side3;
        return perimeter;
    }

    public double areaTriangle() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }
}