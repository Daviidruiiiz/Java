/*    
 *
 * Program.java 
 * 
 * Multiply matrius.
 * 
 * ©Copyright 2023 David Ruiz <davidrp02444@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Program {

    /**
     * Multiply two matrices.
     * 
     * @param n1 a matrix of integer numbers of dimension n
     * @param n2 a matrix of integer numbers of dimension n
     * @return the result of n1 amd n2
     */
    public int[][] multiplyMatrix(int[][] n1, int[][] n2) {
        int n = n1.length, i, j, k;
        int[][] matriu = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    matriu[i][j] = matriu[i][j] + n1[i][k] * n2[k][j];
                }
            }
        }
        return matriu;
    }

}
