/*
 * 
 * Program.java
 * 
 * Write an entire name and write the largest name and the smallest name. 
 * 
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */
import java.util.Locale;
import java.util.Scanner;

public class Program {
    
     /*
     * 
     * Write an entire name and write the largest name and the smallest name. 
     * 
     * @param a n = numbers
     * @param b i = times counter
     * 
     * 
     */
    
    public static void main (String[] args) {
        int num, max, min;   // Create Variables
        Scanner s = new Scanner(System.in); // Start Scanner
        s.useLocale(Locale.ENGLISH); // Set locale
        System.out.print("How many numbers? "); 
        int n = s.nextInt(); // Save the quantity of numbers

        System.out.print("\nNumber ? ");
        num = s.nextInt();
        max = num; //Get the max num
        min = num; // Get the min num

        for(int i = 2; i <= n; i++) { // Create the conditional for the quantity of numbers
            System.out.print("\nNumber ? ");
            num = s.nextInt();

            if (num > max) {
                max = num;
            } else if ( num < min ) {
                min = num;
            } // Check if the new number it's the max or min
        }
        System.out.printf("\nMAXIMUM = %d\n", max); // Print the max number
        System.out.printf("\nMINIMUM = %d\n", min); // Print the min number
    }
}
