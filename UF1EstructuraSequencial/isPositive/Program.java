/*
 * 
 * Program.java
 * 
 * Determine if a real name is positive.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Determine if a real name is positive.
     * 
     * @param a realName
     * @return Returns true or false depends if is true or false
     *
     */
   public boolean isPositive(int realName) {
       // Variable declaration
       boolean itsReal;
       boolean nReal;
       // Tell if is positive or not
       itsReal =
          nReal = realName >= 0 ;
       // Return true or false
        return itsReal;
   }
}