package pointWithoutEqualsIsAndHash;

import java.util.HashSet;

public class PointTUI {
	
	public static void main(String[] args) {
		Point p1 = new Point(10, 20); // Iniciamos p1,p2,p3 con sus valores por defecto
		Point p2 = new Point(60, 30);
		Point p3 = new Point(10, 20);
		HashSet<Point> points = new HashSet<Point>(); // Especificamos que dentro de el nuevo hash "points" queremos p1,p2,p3
		points.add(p1); // Añadimos los valores de p1,p2,p3 al Hash
		points.add(p2);
		points.add(p3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("-------------------");
		System.out.println(points); // printeamos los valores, al p1 y p3 ser iguales, solo saldran por pantalla
		// los valores p1,p3 = 10,20 y p2 = 60,30
	}

}
