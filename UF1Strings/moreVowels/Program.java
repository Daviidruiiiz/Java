/*    
 *
 * Program.java 
 * 
 * Check if the string contain more vowels than consonants.
 * 
 * ©Copyright 2023 David Ruiz <davidrp02444@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    
    /**
     * 
     * Check if the string contain more vowels than consonants
     * 
     * 
     * @param str 
     * @return true or false
     */
    
    public boolean moreVowels(String str) {
        String string_aeiou = "aeiou"; // Start a string as "aeiou"
        int contador_consonantes = 0;  // Start counters
        int contador_vocales = 0;
        str = str.toLowerCase();
        boolean moreVowels = false;
        
        for (int i = 0; i < str.length(); i++) { // Go through the array
            char c = str.charAt(i); // We save the letter in the variable      
            if (string_aeiou.contains(Character.toString(c).toLowerCase())) {
                contador_vocales++; // If the letter its a vowel count++ 
            } else {
                contador_consonantes++; //if not count_consonants++
            }
        }
        moreVowels = contador_vocales > contador_consonantes; //Condition if count_vowels > than count_cons = true
        return moreVowels;
    }
    
}
