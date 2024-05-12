/*    
 *
 * Program.java 
 * 
 * Calculate the transposed matrix.
 * 
 * ©Copyright 2023 David Ruiz <davidrp02444@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {

    /**
     * Calculate the transposed matrix of a matrix.
     * 
     * @param matrix a matrix
     * @param rows the number of rows of the matrix
     * @param cols the number of columns of the matrix
     * @return the transposed matrix
     */
    public double[][] transpose(double[][] matrix) {
        int i, j;
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] matrixTransposed = new double[cols][rows];
        for (i = 0; i < cols; i++) {
            for (j = 0; j < rows; j++) {
                matrixTransposed[i][j] = matrixTransposed[j][i];
            }
        }
        return matrixTransposed;
    }
}
