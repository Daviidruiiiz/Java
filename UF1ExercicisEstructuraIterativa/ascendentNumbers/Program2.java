/*
 * 
 * Program.java
 * 
 * Write all the numberes between n1 and n2 
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */
public class Program2 {
    /*
     * 
     * Write all the numberes between n1 and n2
     * 
     * @param a n1 = first num(smallest)
     * @param b n2 = second num(bigger)
     * 
     */
    
    
    public void writeAscNumbers(int n1, int n2) {
        int i; // it can be started outside or you can do it inside
        for (i = n1; i <= n2; i++) { //starting i into it is (int i = n1; y <= n2; i++)
            System.out.print(i + " ");
        }
    }
}