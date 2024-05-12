/*
 * 
 * Program.java
 * 
 * Calcula el porcentaje descontado en una compra a partir
 * del precio de la tarifa y del precio pagado (supondremos que no se aplica IVA).
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Calcula el porcentaje descontado en una compra
     * 
     * @param a precioCompra
     * @param b precioPagado
     * @param c precioConDescuento
     * @return Devuelve el precio con el descuento aplicado 
     *
     */
   public double precios(double precioCompra, double precioPagado) {
       // Variable declaration
       double precioConDescuento = (precioPagado/precioCompra)*100;
       // Return the price final
        return precioConDescuento;
   }
}