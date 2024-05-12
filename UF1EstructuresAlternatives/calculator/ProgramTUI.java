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
import java.util.Scanner;
public class ProgramTUI {
    
    /**
     * Determines if 3 segments form a triangle.
     * 
     * @param a - the length of the first segment 
     * @param b - the length of the second segment
     * @param c - the length of the third segment
     * @return true if -a-, -b-, and -c- can form a triangle, false otherwise 
     */
    /**
     * Variables
     * */
    double num;
    double num2;
    double awnser;
    public static void main(String[] args) {
        int calculatorMenu;
        Scanner s = new Scanner(System.in);
        // Print a menu with all the options
        System.out.print("\n\nMENÚ\n\n");
        System.out.print("1. Suma\n");
        System.out.print("2. Resta\n");
        System.out.print("3. Multiplicar\n");
        System.out.print("4. Dividir\n");
        // Ask for an option
        System.out.print("\nOpció ? ");
        calculatorMenu = s.nextInt();
        // TODO: Common actions, if necessary.
        // Depending on the chosen option, we perform the desired operation.
        switch(calculatorMenu) {
            case 1:
                double num;
                double num2;
                double awnser;
                num = 0;
                num2 = 0;
                System.out.println("What numbers do you want to calculate?:" + num + num2);
                num = s.nextDouble();
                num2 = s.nextDouble();
                awnser = num + num2;
                System.out.println("La respuesta es " + awnser);
                break;
            case 2:
                num = 0;
                num2 = 0;
                System.out.println("What numbers do you want to calculate?:" + num + num2);
                num = s.nextDouble();
                num2 = s.nextDouble();
                awnser = num - num2;
                System.out.println("La respuesta es " + awnser);
                break;
            case 3:
                num = 0;
                num2 = 0;
                System.out.println("What numbers do you want to calculate?:" + num + num2);
                num = s.nextDouble();
                num2 = s.nextDouble();
                awnser = num * num2;
                System.out.println("La respuesta es " + awnser);
                break; 
            case 4:
                num = 0;
                num2 = 0;
                System.out.println("What numbers do you want to calculate?:" + num + num2);
                num = s.nextDouble();
                num2 = s.nextDouble();
                awnser = num / num2;
                System.out.println("La respuesta es " + awnser);
                break; 
            default:
                System.out.println("Onde va colegon, que te piensas que soy,einstein?");
        }
    }
}
