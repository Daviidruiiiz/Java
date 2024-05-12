/*
 * 
 * Program.java
 * 
 * Given a day, month and year determine if it is a valid date. The value of the days must be kept in mind depending 
 * on the months and years.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Determine if it is a valid date
     * 
     * @param a day
     * @param b month
     * @param c year
     *
     */
public boolean isDate(int day, int month, int year) {
    // Variable declaration
    boolean month31DaysCheck = (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
                                     || month == 12) && (day <= 31);
    
    boolean month30DaysCheck = (month == 4 || month == 6 || month == 9 || month == 11) && (day <= 30);
    
    boolean monthFebruary = (month == 2) && ((day <= 28) || (day <= 29 && (year % 400 == 0 || (year % 4 == 0
                                     && year % 100 != 0))));
    
    boolean date = month31DaysCheck || month30DaysCheck || monthFebruary;
    
    // Return the result
    return date;
    }
}
