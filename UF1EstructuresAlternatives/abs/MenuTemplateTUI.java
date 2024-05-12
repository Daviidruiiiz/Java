/*
 * Program.java        1.0 02/11/2011
 *
 * Make menu with options the program.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

import java.util.Locale;
import java.util.Scanner;

public class MenuTemplateTUI {
    // GET THE ABS CODE
    public static double absoluteValue(double num) {
        // Variable declaration
        double answer = num;
        if (num < 0) {
            answer = num * (-1);
        }
        // Return the result
        return answer;
    }
    //GET THE MIN NUMBER CODE
    public static int min2(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
    /**
     * This is a template for a generical meun.
     * 
     * @param args Not used
     */
    public static void main(String[] args) {
        int op;
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.ENGLISH);
        // Print a menu with all the options
        System.out.print("\n\nMENÚ\n\n");
        System.out.print("1. Valor Absolut\n");
        System.out.print("2. Minim de dos nombres\n");
        System.out.print("3. Sortir\n");
        // Ask for an option
        System.out.print("\nOpció ? ");
        op = s.nextInt();
        // TODO: Common actions, if necessary.
        // Depending on the chosen option, we perform the desired operation.        
        switch (op) {
            case 1:
                // TODO: Perform option 1
                Scanner sca = new Scanner(System.in); // call scanner 
                double num;
                num = 0; // start variable
                System.out.println("What number you want to calculate the abs" + num);
                num = sca.nextDouble();
                double resultabs = absoluteValue(num); //Get the given num as absoluteValue
                System.out.println("The absolute value of " + num + " is " + resultabs);
                break;
            case 2:
                // TODO: Perform option 2
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the first number: ");
                num = sc.nextInt();
                
                System.out.print("Enter the second number: ");
                int num2 = sc.nextInt();
                
                int result = min2((int)num, num2);
                
                System.out.println("The minimum between " + num + " and " + num2 + " is " + result);
                break;
            case 3:
                // TODO: Perform option 2
                System.out.println("Chau pescau");
                break;
            default:
                // TODO: Perform a default action, if necessary.
                  System.out.println("Tas equivocao");
                break;
        }
        // TODO: Common actions, if necessary.
    }
}
