/*
 * 
 * ProgramTUI.java
 * 
 * Calculate the valor absolute of a real number 
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */
import java.util.Scanner;
public class ProgramTUI {
    
    /**
     *Calculate the valor absolute of a real number without Maths.abs
     * 
     * @param a num
     * 
     *
     */
    
    public static double absoluteValue(double num) {
        // Variable declaration
        double answer = num;
        if (num < 0) {
            answer = num * (-1);
        }
        // Return the result
        return answer;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // call scanner 
        double num;
        num = 0; // start variable
        System.out.println("What number you want to calculate the abs" + num);
        num = s.nextDouble();
        double result = absoluteValue(num); //Get the given num as absoluteValue
        System.out.println("The absolute value of " + num + " is " + result);
    }
}
