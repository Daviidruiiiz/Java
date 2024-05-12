/*
 * 
 * Program.java
 * 
 * Calcula la mitja aritmetrica de tres numeros reals
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Calcular les mitjes
     * 
     * @param a primer numero real
     * @param b un segunda numero real
     * @param c un tercer numero real
     * @return devuelve la media de los tres numeros
     */
   public double average(double a, double b, double c) {
       // Variables
       double z;
       // Añade los datos de los enteros
       z = (a + b + c) / 3;
       // Devuelve el resultado
       return z;
   }
}