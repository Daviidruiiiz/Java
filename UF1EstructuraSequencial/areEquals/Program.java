/*
 * 
 * Program.java
 * 
 * Given two real numbers and a tolerance of error, determine whether the numbers are equal.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * determine whether the numbers are equal
     */
   public boolean areEquals(double num1, double num2, double tolerance) {
       // Variable declaration
       // Return if the tolerance are real
       return Math.abs(num1 - num2) <= tolerance;
   }
}