/*
 * 
 * Program.java
 * 
 * Calculate the lateral area and volume of a right cylinder, from its radius and its height.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

   /**
    * calculate the lateral area and volume
    * 
    * @param a radius
    * @param b height
    * @param c pi
    * 
    */
    public double volume(double radius, double height) {
        // Variable declaration
        double pi = 3.14;
        double volCylinder = pi * (radius * radius) * height;

        
        return volCylinder;
    }
        
     public double area(double radius, double height) {
        // Variable declaration
        double pi = 3.14;
        double lateralArea = 2 * pi * radius * height;
        
        return lateralArea;

    }
}