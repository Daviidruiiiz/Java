/*
 * 
 * Program.java
 * 
 * Calculate the valor absolute of a real number 
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     *Calculate the valor absolute of a real number without Maths.abs
     * 
     * @param a num
     * 
     *
     */
public int abs(int num) {
    // Variable declaration
    int awnser = num;
        awnser = num;
        if (num < 0)
        awnser = num * (-1);
    // Return the result
    return awnser;
    }
}
