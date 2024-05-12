/*    
 *
 * Program.java 
 * 
 * Check if the string contain all of the Vowels.
 * 
 * ©Copyright 2023 David Ruiz <davidrp02444@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    
    /**
     * 
     * Check if all the vowels are in the string
     * 
     * 
     * @param str 
     * @return true or false
     */
    
    public boolean allVowels(String str) {
        str = str.toLowerCase();
        boolean isTrue = false;
        if (str.contains("a") && str.contains("e") &&
            str.contains("i") && str.contains("o") &&
            str.contains("u"));{
            isTrue = true;
        }
        return isTrue;
    }
    
}
