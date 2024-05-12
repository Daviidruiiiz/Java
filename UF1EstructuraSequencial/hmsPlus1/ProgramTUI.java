/*
 * 
 * ProgramTUI.java
 * 
 * From three inputs representing hours, minutes and segments, add a segment and output the result 
 * in the format “h:m:s”.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 * 
 * hmsPlus1
 */
import java.util.Scanner;

public class ProgramTUI {

   /**
    * From three inputs representing hours, minutes and segments, add a segment and output the result
    * in the format “h:m:s”.
    * 
    * This program has a terminal use
    * 
    * @param args Not used
    */


    public static void main(String[] args) {
    // The int of the valor
        int hours;
        int minutes;
        int seconds;
    // A Scanner to read from the keyboard
    Scanner s = new Scanner (System.in);
    // Print the questions to the user and Read the answers
    System.out.print("Cuantes hores?");
    hours = s.nextInt();
    System.out.print("Quants minuts?");
    minutes = s.nextInt();
    System.out.print("Quants segons?");
    seconds = s.nextInt() + 1;
    // Print in format h:m:s
    System.out.println("how long has it been? " + hours + "h:" + minutes + "min:" + seconds + "s" );
   }
}
