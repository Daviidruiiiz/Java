/*
 * 
 * ProgramTUI4_2.java
 * 
 * Asks the name, age and weight and returns the answer
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */
import java.util.Scanner;

public class ProgramTUI4_2 {

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
    String name2;
    int edat2;
    double pes2;
    // A Scanner to read from the keyboard
    Scanner s = new Scanner (System.in);
    // Print the questions to the user and Read the answers
    System.out.printf(" 1)Com et dius?");
    name = s.nextLine();
    System.out.printf("Hola %s !!!\n", name);
    System.out.printf("1)Quina edat tens? ");
    edat = s.nextInt();
    System.out.printf("1)Quan peses? ");
    pes = s.nextDouble();
    System.out.printf("2)Com et dius?");
    name2 = s.nextLine();
    name2 = s.nextLine();
    System.out.printf("Hola %s !!!\n", name2);
    System.out.printf("2)Quina edat tens? ");
    edat2 = s.nextInt();
    System.out.printf("2)Quan peses? ");
    pes2 = s.nextDouble();
 
        System.out.printf("--------------------------------\n");
        System.out.printf("|%-15s:%15s|\n", "NOM1", name);
        System.out.printf("--------------------------------\n");
        System.out.printf("|%-15s:%15s|\n", "NOM2", name2);
        System.out.printf("--------------------------------\n");
        System.out.printf("|%-15s:%015d|\n", "EDAT_1", edat);
        System.out.printf("--------------------------------\n");
        System.out.printf("|%-15s:%015d|\n", "EDAT_2", edat2);
        System.out.printf("--------------------------------\n");
        System.out.printf("|%-15s:%12.2fKgr|\n", "PES1", pes);
        System.out.printf("--------------------------------\n");
        System.out.printf("|%-15s:%12.2fKgr|\n", "PES2", pes2);
        System.out.printf("--------------------------------\n");

   }
}
