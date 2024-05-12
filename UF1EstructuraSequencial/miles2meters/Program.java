/*
 * 
 * Program.java
 * 
 * Calculates the value in meters of a distance
 * expressed in nautical miles. 1 nautical mile = 1852 meters
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Indicate the meters in a nautical miles
     * 
     * @param a nauticalmile
     * @return Returns the meters
     *
     */
   public int miles2meters(int nauticalmile) {
       // Variable declaration
       int metersConversion;
       // Take position for every number
       metersConversion = nauticalmile * 1852;
       // Return the positions 
        return metersConversion;
   }
}