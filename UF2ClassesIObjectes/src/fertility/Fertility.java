/*
 * Fertility.java
 * 
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package fertility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;

/**
 * Modelizes a calendar to know the fertility periods of a woman.
 * 
 * For more information, 
 * see http://en.wikipedia.org/wiki/Calendar-based_contraceptive_methods
 * 
 * @author Mònica Ramírez Arceda
 * @version 22/02/2012
 */
public class Fertility {

    // Attributes
    private String lastMenstruationDate;
    private int cycleDays;

    // Constructor
    public Fertility(String lastMenstruationDay, int cycleDays) {
        this.lastMenstruationDate = lastMenstruationDay;
        this.cycleDays = cycleDays;
    }

    /**
     * Checks if this method is reliable by cycle days number.
     * 
     * @return true if it is reliable, false otherwise.
     */
    public boolean isReliableMethod() {
        return this.cycleDays >= 26 && this.cycleDays <= 32;
    }

    /**
     * Check if the woman is fertile on a date.
     * 
     * @param date a date
     * @return 1 if the woman is fertile, 0 if the woman is not fertile and -1 if the method can't be applied.
     */
    public int isFertile(String date) {
        LocalDateTime dt = JodaDT.parseDDMMYYYY(date);
        LocalDateTime dtl = JodaDT.parseDDMMYYYY(this.lastMenstruationDate);
        // Between the 1rst and the 7th days, she is not fertile
        if (dt.isAfter(dtl.minusDays(1)) && dt.isBefore(dtl.plusDays(7))) {
            return 0;
        }
        // Between the 8th and the 19th day, she is fertile
        if (dt.isAfter(dtl.plusDays(6)) && dt.isBefore(dtl.plusDays(19))) {
            return 1;
        }
        // Between the 20th and the last day, she is not fertile
        if (dt.isAfter(dtl.plusDays(18)) && dt.isBefore(dtl.plusDays(this.cycleDays))) {
            return 0;
        }
        // it cannot be applied
        return -1;
    }

    /**
     * Check if the woman is fertile today.
     * 
     * @return a descriptive string saying if the woman is fertile or not or the method can't be applied.
     */
    public int isFertile() {
        LocalDateTime now = LocalDateTime.now();
        String nowS = JodaDT.formatDDMMYYYY(now);
        return isFertile(nowS);
    }

    /**
     * Prints a report of the last menstruation cycle.
     */
    public void reportFertilityDays() {
        String dateS = this.lastMenstruationDate;
        LocalDateTime date = JodaDT.parseDDMMYYYY(dateS);
        System.out.print("DIES FERTILITAT ÚLTIM CICLE\n");
        System.out.print("---------------------------\n\n");
        for (int i = 0; i < cycleDays; i++) {
            System.out.print(dateS + ": ");
            switch (isFertile(dateS)) {
            case 1:
                System.out.print("És fèrtil");
                break;
            case 0:
                System.out.print("NO és fèrtil");
                break;
            case -1:
                System.out.print("No aplicable");
                break;
            }
            System.out.println();
            date = date.plusDays(1);
            dateS = JodaDT.formatDDMMYYYY(date);
        }
        System.out.print("\n");
    }

}
