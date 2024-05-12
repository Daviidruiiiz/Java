/*
 * 
 * Program.java
 * 
 * From day, month, and year, returns the next day in the "dd/mm/yyyy" format.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {
    
    /**
     * From day, month, and year, returns the next day in the "dd/mm/yyyy" format.
     *
     * @param day   The day.
     * @param month The month.
     * @param year  The year.
     * @return      The next day in the "dd/mm/yyyy" format.
     */
    public static String dayPlus1(int day, int month, int year) {
        int daysInMonth;
        // Determine the number of days in the given month
        if (month == 2) {
            // Handle February separately for leap years
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                // Leap year
                daysInMonth = 29;
            } else {
                // Non-leap year
                daysInMonth = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else {
            daysInMonth = 31;
        }
        if (day == daysInMonth) {
            day = 1;
            month += 1;
        }else{
            day += 1;
        }
        
        if (month == 13) {
            // If it's December, reset to January of the next year
            month = 1;
            year += 1;
        } 
        // return the next day 
        return "The date its " + day + "/" + month + "/" + year;   }
}


