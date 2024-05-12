/*    
 *
 * Program.java 
 * 
 * Number of Vowels.
 * 
 * ©Copyright 2023 David Ruiz <davidrp02444@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    
    /**
     * 
     * Sum two matrices
     * 
     * 
     * @param m1 a matrix of integer of dimension
     * @param m2 a matrix of integer of dimension
     * @return the sum of m1 and m2
     */
    
    public int numberOfVowels(String str) {
        int vowelCount = 0;
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                str.charAt(i) == 'u');
            vowelCount++;
        }
    return vowelCount;
    }
}
