/*
 * 
 * Program.java
 * 
 * Calcula l'àrea d'un triangle a partir de la seva base i la seva altura
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Calcula l'àrea d'un triangle
     * 
     * @param a base
     * @param b height
     * @return return the area of triangle
     */
   public double triangle(double height, double base) {
       // Variables
       double area;
       // Añade los datos de los enteros
       area = (height * base) / 2;
       // Devuelve el resultado
       return area;
   }
}