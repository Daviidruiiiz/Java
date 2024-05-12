/*
 * 
 * Program.java
 * 
 * Based on a temperature in degrees Fahrenheit, calculates the equivalent value in 
 * degrees Celsius. Derive the appropriate formula from of the formula of
 * the previous exercise.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Calculate Fahreinheit to Celsius
     * 
     * @param a fahreinheit
     * @param b totalCelsius
     * @return Returns Celsius
     *
     */
   public double fahrenheit2celsius(double fahreinheit) {
       // Variable declaration
       double totalCelsius;
       // Take the fahreinheit to celsisus
       totalCelsius= (fahreinheit - 32) * 5 / 9;
       // Return the amount of celsius
        return totalCelsius;
   }
}