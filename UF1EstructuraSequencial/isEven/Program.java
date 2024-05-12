/*
 * 
 * Program.java
 * 
 * Given a number, determine if it is even.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Given a number, determine if it is even.
     * 
     * @param a number
     * @return Returns true or false depends if its even or not.
     *
     */
   public boolean isEven(int number) {
       // Variable declaration
       boolean evenOrNot;
       // Tell if is positive or not
       evenOrNot =
          number % 2 == 0;
       // Return true or false
        return evenOrNot;
   }
}