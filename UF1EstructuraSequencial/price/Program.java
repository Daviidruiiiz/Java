/*
 * 
 * Program.java
 * 
 * Calculate the final price of a product, taking into account IVA (in %)
 * and the discount (in %) applied.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Calculate the final price of a product
     * 
     * @param a price
     * @param b discount
     * @param c discount
     * @return returns the price with discount and iva 
     *
     */
   public double priceiva(double price, double discount) {
       // Variable declaration
       double pricediscount = price*discount/100;
       // Adds iva to final price
        double pricefinal = price - pricediscount;
       // Return the price final
        return pricefinal  * 1.21;
   }
}