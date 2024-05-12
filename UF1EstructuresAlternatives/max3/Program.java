/*
 * 
 * Program.java
 * 
 * Gets the max number between three real numbers
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     *Gets the max number between trhee real numbers
     * 
     * @param a num
     * @param b num2
     * @param c num3
     *
     * @return the max number
     */
public int max2(int num, int num2,int num3) {
    // Variable declaration
    int awnser = num; 
    if (num > num2 && num > num3) {
    awnser = num; // If num its bigger than the other nums, change awnser with num
} 
    else if (num2 > num3 && num2 > num) {
    awnser = num2; // If num2 its bigger than the other nums, change awnser with num2
}
    else if (num3 > num && num3 > num2){
    awnser = num3; // If num3 its bigger than the other nums, change awnser with num3
}
    // Return the result
    return awnser;
    }
}
