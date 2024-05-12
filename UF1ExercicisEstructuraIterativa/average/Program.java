/*
 * 
 * Program.java
 * 
 * Average between numbers
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
     * Average between numbers. 
     * 
     * @param a n = numbers
     * @param b i = times counter
     * 
     * 
     */
    
    public static void main(String[] args) {
        int num ; // Create Variables
        Scanner s = new Scanner(System.in); // Start Scanner
        s.useLocale(Locale.ENGLISH); // Set locale
        
        
        System.out.print("\nNumber " + " ? ");
        num = s.nextInt();
        int n = 0;
        int sum = 0; // Variable to store the sum of numbers
        while (num != 0){
            System.out.print("\nNumber " + " ? ");
            num = s.nextInt();
            sum += num; // Add the current number to the sum
            n++; 
        }
        
        // Calculate and display the average
        double average = (double) sum / n;
        System.out.println("\nThe average of the " + n + " numbers is: " + average);
    }
}