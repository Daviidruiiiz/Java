/*
 * 
 * Program.java
 * 
 * Calculate the speed of a train in km/hour, knowing the distance traveled 
 * in meters and the time taken in seconds to travel this distance.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Calculate the speed of a train in km/hour
     * 
     * @param a speedOnMeters
     * @param b time (time to complete the travel)
     * @return Returns the km/h
     *
     */
   public double velocity(double speedOnMeters, double timeInSeconds) {
       // Variable declaration
       double kmhConversion;
       // Take position for every number
       kmhConversion = speedOnMeters / timeInSeconds * ( 1.0/1000.0 ) * ( 3600.0 / 1.0 );
       // Return the positions 
        return kmhConversion;
   }
}