/*
 * 
 * ProgramTUI4.java
 * 
 * Read two keyed real numbers, put them into two variables, 
 * swap the contents of the two variables, and write their value to the screen.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */
import java.util.Scanner;

public class ProgramTUI {

   /**
    * Swap the contents of the two variables, and write their value to the screen. This program has a terminal use
    * 
    * @param args Not used
    */


    public static void main(String[] args) {
    // The int of the valor
        double pvalor ;
        double svalor ;
    // A Scanner to read from the keyboard
    Scanner s = new Scanner (System.in);
    // Print the questions to the user and Read the answers
    System.out.print("Quin es el primer valor");
    pvalor = s.nextDouble();
    System.out.print("Quin es el segon valor");
    svalor = s.nextDouble();
    double auxvalor = pvalor;
    pvalor = svalor;
    svalor = auxvalor;
    // Print the values swaped
    System.out.println("El primer valor es " + pvalor + " y el segon es " + auxvalor );
   }
}
