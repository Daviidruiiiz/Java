/*
 * 
 * ProgramTUI.5java
 * 
 * Asks the coords of diferents points and get the midpoint
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */
import java.util.Scanner;

public class ProgramTUI {

   /**
    * Returns the midpoint between coords. This program has a terminal use
    * 
    * @param args Not used
    */


    public static void main(String[] args) {
		public doouble average2(double pvalor, double svalor) {
   return (pvalor + svalor) / 2;
}
    // The int of the valor
        double pvalor;
        double svalor;
        double tvalor;
        double cvalor;
    // A Scanner to read from the keyboard
    Scanner s = new Scanner (System.in);
    // Print the questions to the user and Read the answers
    System.out.print("Quin es el primer valor");
    pvalor = s.nextDouble();
    System.out.print("Quin es el segon valor");
    svalor = s.nextDouble();
    System.out.print("Quin es el tercer valor");
    tvalor = s.nextDouble();
    System.out.print("Quin es el quart valor");
    cvalor = s.nextDouble();
    // Say hello to the user
    double midpoint = ((pvalor + svalor) / 2 );
    double midpoint2 = ((tvalor + cvalor)/2);
    System.out.println("El primer valor es " + ((pvalor + svalor) / 2 ) + " y el segon es " + ((tvalor + cvalor)/2));
    System.out.printf("%s:(%.2f) %s:(%.2f) %s(%.2f) %s:(%.2f) %s:(%.2f) %s(%.2f)", "primerValor", pvalor, "segonValor", svalor,
                      "el midpoint de los dos",midpoint, 
                      "ahora el tercerValor", tvalor, "quartValor", cvalor, "el midpoint de estos dos es:", midpoint2);
   }
}
