/*    
 *
 * Program.java 
 * 
 * Determines whether a matrix is symmetric.
 * 
 * ©Copyright 2023 David Ruiz <davidrp02444@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {

    /**
     * Determines whether a matrix is symmetric.
     * @param matrix a matrix
     * @return true if m is symmetric, false otherwise
     */
    public boolean isSymmetric(int[][] m) {
        int n = matrix.length, i, j;
        boolean symmetric = true;
        for (i = 0; i < n && symmetric; i++) {
            for (j = i + 1; j < n && symmetric; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                }
            }
        }
        return symmetric;
    }
}
