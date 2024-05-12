/*
 * 
 * Program.java
 * 
 * Write all odd the numberes between n1 and n2 
 * 
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */
public class Program {
    /*
     * 
     * Write all odd the numberes between n1 and n2
     * 
     * @param a n1 = first num to read
     * @param b n2 = second num the biggest in the range
     * 
     */
    
    
    public void writeEvenNumbers(int n1, int n2) {
        // Variable declaration
        int i;
        i = n1;
        
        while (i <= n2) {
            if (i % 2 == 0){
                System.out.print(i + " ");
                
            }else {              
            }
            i++; 
            }
        
    }
}