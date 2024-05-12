/*    
 *
 * Program.java 
 * 
 * Check where is "B" arrays and String.
 * 
 * ©Copyright 2023 David Ruiz <davidrp02444@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


import java.util.Scanner;

public class Program {
    /*
     * Check where is "B" arrays and String.
     * 
     * @param taula
     * return
     */
    
    
    public int[] posicio(String[][] taula) {
        int posicioX = 0;
        int posicioY = 0;
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula[0].length; j++) {
                if (taula[i][j].equals("B")) {
                    posicioX = i+1;
                    posicioY = j+1;}}}
        int[] resultat = {posicioX, posicioY};
        return resultat;}
    
}