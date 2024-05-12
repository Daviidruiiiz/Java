/*
 * 
 * Program.java
 * 
 * Given the month and year of a date, find the number of days in the month of that year.
 * 
 * Copyright 2023 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

public class Program {

    /**
     * Given the month and year of a date, find the number of days in the month of that year.
     * 
     * @param a num
     *
     * @return the correctly rounded number
     */
public int getNumberOfDays(int month, int year) {
    // Variable declaration
    int days = 0;
    // Get the method 
    if (month == 1  || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
        days = 31;
    }
    else if (month == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 == 0))){                  
        days = 28;
    }
    else if (month == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
        days = 29;
    }
    else{
        days = 30;
    }
    // Return the result 
    return days;
    }
}
