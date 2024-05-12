/*
 * 
 * ProgramTUI.java
 * 
 * Reads an integer number of seconds and writes the equivalent number of days, hours, minutes and seconds in d:h:m:s format.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */
import java.util.Scanner;

public class ProgramTUI {

   /**
    * Reads an integer number of seconds and writes the equivalent number of days, hours, minutes and seconds in h:m:s format.
    * This program has a terminal use
    * 
    * @param args Not used
    */


    public static void main(String[] args) {
    // The int of the valor
        int inputseconds;
        int days;
        int hours;
        int minutes;
        int seconds;
    // A Scanner to read from the keyboard
    Scanner s = new Scanner (System.in);
    // Print the questions to the user and Read the answers
    System.out.print("Cuants segons son en total?");
    inputseconds = s.nextInt();
    days = inputseconds / 86400;
    int remainingsec = inputseconds % 86400;
    hours = remainingsec / 3600;
    remainingsec = remainingsec % 3600;
    minutes = remainingsec / 60;
    seconds = remainingsec % 60;
    // Print in format h:m:s
    System.out.println("how long has it been? " + days + "days " + hours + "hours " + minutes + "min " + seconds + "s");
   }
}
