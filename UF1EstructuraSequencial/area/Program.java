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
   public int area(int height, int baseshort, int baselong) {
       // Variable declaration
       int areaHxB;
       // Take position for every number
       areaHxB = (baseshort + baselong)*height/2 ;
       // Return the positions 
        return areaHxB;
   }
}