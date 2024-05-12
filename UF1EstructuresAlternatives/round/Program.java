/*
 * 
 * Program.java
 * 
 * Given a positive decimal number and the number of decimal places to be rounded
 * calculate the correctly rounded number
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Given a positive decimal number and the number of decimal places to be rounded
     * calculate the correctly rounded number
     * 
     * @param a num 
     * @param b numDecinamals
     *
     * @return the correctly rounded number
     */
public double roundedNumber(double num, int numDecimals) {
    // Variable declaration
    int answer = 0;
    // Get the method
    double x = num * Math.pow(10,numDecimals+1);
    // Cut the decimal part
    int nonDecimalNum = (int)x;
    // Get the digits
    int units = nonDecimalNum % 10;
    if (units >= 5){
        nonDecimalNum = ( nonDecimalNum / 10 ) + 1;
    }
    else {
        nonDecimalNum = ( nonDecimalNum / 10 ); 
    }
    x = nonDecimalNum / Math.pow(10, numDecimals);
    
    // Return the result 
    return x;
    }
}
