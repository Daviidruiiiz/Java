/*
 * 
 * ProgramTUI3.java
 * 
 * Asks the name, age and weight and returns the answer
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */
import java.util.Scanner;

public class ProgramTUI3 {

   /**
    * Says hello to the user. This program has a terminal use
    * 
    * @param args Not used
    */


    public static void main(String[] args) {
    // The name of the user
    String name;
    int edat;
    double pes;
    // A Scanner to read from the keyboard
    Scanner s = new Scanner (System.in);
    // Print the questions to the user and Read the answers
    System.out.print("Com et dius? ");
    name = s.nextLine();
    System.out.print("Quants anys tens? ");
    edat = s.nextInt();
    System.out.print("Quin es el teu pes? ");
    pes = s.nextDouble();
    // Say hello to the user
    System.out.println("Hola " + name + " aixi que tens " + edat + " anys y el teu pes és " + pes + "kg !!!!");
    System.out.printf("Hola %s !!!", name);
   }
}
