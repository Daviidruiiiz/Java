/*
 * 
 * Program.java
 * 
 * Given four integers, determine if they can be an IP address.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Determine if that four integers can be an IP address
     * 
     * @param a ip1
     * @param b ip2
     * @param c ip3
     * @param d ip4
     * @return Returns the true or false
     *
     */
   public boolean isIP(int ip1, int ip2, int ip3, int ip4) {
       // Variable declaration
       boolean isip1 = 
           ip1 >= 0 && ip1 <= 255;
       boolean isip2 = 
           ip2 >= 0 && ip2 <= 255;
       boolean isip3 = 
           ip3 >= 0 && ip3 <= 255;
       boolean isip4 = 
           ip4 >= 0 && ip4 <= 255;
       // Take position for every number
       boolean ips;
       ips = isip1 && isip2 && isip3 && isip4 ;
       
       // Return the positions 
        return ips;
   }
}