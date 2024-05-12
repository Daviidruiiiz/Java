/*    
 *
 * ProgramTUI.java 
 * 
 * Return on screen the array draw.
 * 
 * ©Copyright 2023 David Ruiz <davidrp02444@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.*;
public class ProgramTUI {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nr, nc, i, j;
        int [][] m;
        System.out.printf("\n\nMATRIU\n\n");
        System.out.printf("Nombre de files ? ");
        nr = s.nextInt();
        System.out.printf("Nombre de columnes ? ");
        nc = s.nextInt();
        m = new int [nr][nc];
        // Read the 2D array
        for (i = 0; i < nr; i++) {
            for (j = 0; j < nc; j++) {
                System.out.printf("t[%d][%d] = ", i, j);
                m[i][j] = s.nextInt();
            }
        }
       // Write the 2D array on screen
        for (i = 0; i < nr; i++) {
            for (j = 0; j < nc; j++) {
                System.out.print("|" + m[i][j] + " ");
                
                
                
            }
            System.out.println();
        }
    }
}