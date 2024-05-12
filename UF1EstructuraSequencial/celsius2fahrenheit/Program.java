/*
 * 
 * Program.java
 * 
 * From a temperature in degrees Celsius, calculates the equivalent value in degrees Fahrenheit.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Calculate Celsius to Fahrenheit
     * 
     * @param a Celsius
     * @param b Fahrenheit
     * @param c totalFahrenheit
     * @return Returns fahrenheit
     *
     */
   public double celsiu2Fahrenheit(double celsius) {
       // Variable declaration
       double totalFahrenheit;
       // Take the celsisus to fahreinheit
       totalFahrenheit = (celsius * 9 / 5) + 32;
       // Return the amount of fahreinheit
        return totalFahrenheit;
   }
}