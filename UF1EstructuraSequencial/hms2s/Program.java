/*
 * 
 * Program.java
 * 
 * A partir de un número entero de horas, un número entero de
 * minutos y un número entero de segundos, escribe el número de segundos equivalentes.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Calcula los segundos que hay en un minuto y...
     * 
     * @param a hora
     * @param b minutos
     * @param c segundos
     * @param d segundosTotales
     * @return Devuelve los segundos totales
     *
     */
   public int hms2s(int hora, int minutos, int segundos) {
       // Variable declaration
       int segHora;
       int segMinuto;
       int segundosTotales;
       // Pasamos los minutos a segundos y los sumamos
       segHora = (hora*3600);
       segMinuto = (minutos*60);
       segundosTotales = segHora + segMinuto + segundos;
       // Return the price final
        return segundosTotales;
   }
}