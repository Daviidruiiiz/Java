/*
 * 
 * Program.java
 * 
 * From the lengths of three segments, determine whether or not they form a triangle. In order for three segments 
 * to form a triangle, any segment must be smaller than the sum of the lengths of the other two. If the three segments 
 * form a triangle, determine whether it is equilateral (three equal sides), isosceles (two equal sides), 
 * or scalene (all sides different).
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {
    
    /**
     * Determines if 3 segments form a triangle.
     * 
     * @param a - the length of the first segment 
     * @param b - the length of the second segment
     * @param c - the length of the third segment
     * @return true if -a-, -b-, and -c- can form a triangle, false otherwise 
     */
    public boolean isTriangle(double a, double b, double c) {
        
        // The sum of the lengths of any two sides of a triangle must be greater than the length of the third side.
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }
    
    /** 
     * Finds out the type of an triangle
     * 
     * @param a - the length of a segment 
     * @param b - the length of a segment
     * @param c - the length of a segment
     * @return "Equilater", "Isosceles" or "Escale" if the triangle is valid or "ERROR", otherwise
     * 
     */
    
    public String typeOfTriangle(double a, double b, double c) {
        // Check if the triangle is Equilater,Isosceles or Escale
        String triangleType;
        boolean triangle = isTriangle(a,b,c);
        if (!isTriangle(a, b, c)) {
            triangleType = "ERROR";
        } else if(a == b && a == c) {
            triangleType = "Equilater";
        }else if (a != b && a != c && b != c){
            triangleType = "Scalene";
        }else {
            triangleType = "Isosceles";
        }
        return triangleType;
        
        
        
        
        
        
        /* muchos returns, pero funciona
         if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
         return "ERROR";
         } else if (a == b && b == c) {
         return "Equilater";
         } else if (a == b || b == c || a == c) {
         return "Isosceles";
         } else {
         return "Escale";
         }
         */
    }
}