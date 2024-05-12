/*
 * 
 * Program.java
 * 
 * Calculate the solutions of a quadric equation 
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {
    
    /**
     * Find how mouch number of solutions have a equation
     * 
     * @param a the first parameter of the equation
     * @param b the second parameter of the equation
     * @param c the third parameter of the equation
     * @return the number of solutions
     * 
     * @return the correctly rounded number
     */
    public int numberOfSolutions(double x, double y, double z) {
        
        int solve;
        // Get the method 
        double discriminant = Math.pow(y, 2) - (4 * x * z );
        
        if (discriminant > 0) {
            solve = 2;    
        }
        else if (discriminant == 0) {
            solve = 1;
        }
        else{
            solve = 0;
        }
        // Return the result 
        return solve;
    }
    
    /**
     * Given the month and year of a date, find the number of days in the month of that year.
     * 
     * @param a the first parameter of the equation not zero
     * @param b the second parameter of the equation
     * @param c the third parameter of the equation
     * @return "it was two awnser" if the equation have two solutions,"it has one awnser" if the equation have only
     * one solution, or "it has no one awnser" if not have solution
     * 
     */
    public String calculateSolutions(double a, double b, double c) {
        // Variable
        double x1, x2;
        String awnser;
        int numberOfSolutions;
        double discriminant = Math.pow(a, 2) - (4 * b * c );
        numberOfSolutions = numberOfSolutions(a, b, c); // Make conversion "x, y, z" to "a, b,c " 
        awnser = "null"; // Print something to start the variable
        
        if (numberOfSolutions == 0) { // Return if the equation have no one awnser
            awnser = "It has no one awnser";
        }
        else if (numberOfSolutions == 2) { // Return if the equation have two awnsers
            discriminant = b * b - 4 * a * c;
            x1 = -b + Math.sqrt(discriminant) / 2 * a;
            x2 = -b - Math.sqrt(discriminant) / 2 * a;
            awnser = "x1 = " + x1 + "x2 = " + x2;
        }
        else{ // Return if the equation have one awnser
            x1 = -b / (2 * a);
            awnser = "x = " + x1;
        }
        return awnser;
    }
}