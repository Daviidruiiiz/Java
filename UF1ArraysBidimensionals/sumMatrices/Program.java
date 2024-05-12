/*    
 *
 * Program.java 
 * 
 * Sum matrix.
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
    
    public int [][] sumMatrix(int[][] m1, int  [][] m2) {
        
        int[][] m;
        m = new int [m1.length][m1.length];
        
        for (int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1.length; j++) {
                m[i][j] = m1[i][j] + m2[i][j];
            }
            
        }
        return m;
    }
    
}
