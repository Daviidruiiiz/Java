/*
 * 
 * Program.java
 * 
 * Given the initial velocity of a projectile in m/s and the firing angle in sexagesimal degrees, calculate the 
 * time of flight in seconds (no decimals, truncating down) and the point of impact in meters 
 * (no decimals , truncating downwards). Flight time in seconds and impact distance in meters are calculated with
 * the formulas
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

   /**
    * calculate the time of flight in seconds and the point of impact in meters
    * 
    * @param a velocity
    * @param b gravity
    * @param c shootAngle
    * 
    */
    public double flightTime(double velocity, double shootAngle) {
        // Variable declaration
        double gravity = 9.81;
        double firingAngleRadians = Math.toRadians(shootAngle);
        double flightTimeAwnser = (2 * velocity * Math.sin(firingAngleRadians)) / gravity;

        
        return flightTimeAwnser;
    }
        
     public double distance(double velocity, double shootAngle) {
        // Variable declaration
        double gravity = 9.81;
        double firingAngleRadians = Math.toRadians(shootAngle);
        double distanceTotal = ((velocity * velocity) * Math.sin(2 * firingAngleRadians)) / gravity;

        return distanceTotal;

    }
}
