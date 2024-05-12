package pointWithoutEqualsIsAndHash;

public class Point {
	private int x;
	private int y;
	
	// Getters y Setters
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "{Point = x = " + this.x + ", y = " + this.y + "}\n";
	}

	@Override
	public boolean equals(Object obj) { // Create the equals boolean default code
	  if (this == obj){
	  return true;
	}
	  if (obj == null) {
	  return false;
	}
	  if (this.getClass() != obj.getClass()){
	  return false;
	}
	  // Compare if the obj of x and y its equals, different in every case
	  Point punt = (Point) obj;
	  return ((this.x == punt.x) && (this.y == punt.y));
	}
	@Override
	public int hashCode() {
		return x; // Se especifica el valor por el que juntamos los elementos de dentro del hash
	}
	
}
