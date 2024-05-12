/*
 * 
 * Program.java
 * 
 * Given the size of a screw in centimeters, returns its textual size, according to the following information
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Given the size of a screw in centimeters, returns its textual size, according to the following information
     * 
     * @param a sizeOnCm
     *
     * @return if the textual size 
     */
public String screwSize(double sizeOnCm) {
    // Variable declaration
    String answer = "NULL";
    // Get the method 
    if (sizeOnCm >= 1 && sizeOnCm < 3){
        answer = "petit";
    }
    else if (sizeOnCm >= 3 && sizeOnCm < 5){
        answer = "mitjà";
    }
    else if (sizeOnCm >= 5 && sizeOnCm < 6.5){
        answer = "gran";
    }
    else
        answer = "molt gran";
    // Return the result 
    return answer;
    }
}
