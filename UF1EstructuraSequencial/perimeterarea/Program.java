/*
 * 
 * Program.java
 * 
 * Calculate the area of ​​a trapezoid, from its bases and the
 * its height
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Indicate the area
     * 
     * @param a height
     * @param b baseshort base short
     * parab c baselong base long
     * @return Returns the area
     *
     */
    public double area (double radius) {
   // Variable declaration
        double pi = 3.14;
            // Gets the area of the circle
        double area = pi * (radius)*(radius);
            return area;
    }
    public double perimeter (double radius) {
       // Variable declaration
        double pi = 3.14;
        // Gets the perimeter
        double perimeter = 2 * (pi * radius);
            return perimeter;
    }
}