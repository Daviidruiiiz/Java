/*
 * 
 * Program.java
 * 
 * Given two real numbers a and b, determine whether a third real number is in the open interval (a,b).
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * determine whether a third real number is in the open interval 
     * 
     * @param a firstNumber
     * @param b secondNumber
     * @param c intervalNumber
     * @return Returns true or false depends if intervalNumber its in or out.
     *
     */
   public boolean isInOpenInterval(double firstNumber, double secondNumber, double intervalNumber) {
       // Variable declaration
       boolean isOrNot;
       // Tell if intervalNumber its between firstNumber and secondNumber
       isOrNot =
           intervalNumber >= firstNumber && intervalNumber <= secondNumber ;
       // Return true or false
        return isOrNot;
   }
}