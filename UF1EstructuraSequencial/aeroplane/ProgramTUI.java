/*
 * 
 * ProgramTUI.java
 * 
 * Read the distance between two airports in km and the average speed of the plane in km/h
 * and write the estimated flight time in h:m format.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 * 
 * 
 */
import java.util.Scanner;

public class ProgramTUI {

   /*
    * write the estimated flight time in h:m format.
    * 
    * This program has a terminal use
    * 
    * @param args Not used
    */


    public static void main(String[] args) {
    // The double of the valor
        double km;
        double avgspeed;
        
    // A Scanner to read from the keyboard
    Scanner s = new Scanner (System.in);
    // Print the questions to the user and Read the answers
    System.out.print("Quant indica el cuentakilómetros?");
    km = s.nextInt();
    System.out.print("Quants km hi ha entre aeroport?");
    avgspeed = s.nextInt();
    double time = avgspeed / km;
    double remainingsec = (double) (time % 60);
    // Print in format h:m
    System.out.println(time);
   }
}
