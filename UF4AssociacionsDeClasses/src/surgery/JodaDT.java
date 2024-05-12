/*
 * JodaDT.java
 * 
 * Copyright 2010-2012 Joaquim Laplana
 * 
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package surgery;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

/**
 * Implements LocalDateTime library utilities.
 */
public class JodaDT {

    /**
     * Constructor. Private to forbid instances.
     */
    private JodaDT() {
    }

    /**
     * Creates a LocalDateTime object from a String with this format
     * DD/MM/YYYY-hh:mm:ss.
     * 
     * @param date with format DD/MM/YYYY-hh:mm:ss
     * @return a LocalDateTime object or null
     */
    public static LocalDateTime parseDDMMYYYYhhmmss(String date) {
        if (date != null) {
          String[] dateProperties = date.split("-");
          if(dateProperties != null) {
            String[] propertiesDate = dateProperties[0].split("/");
            String[] propertiesTime = dateProperties[1].split(":");
            if ( propertiesDate != null && propertiesTime != null ) {
              int day = Integer.parseInt(propertiesDate[0]);
              int month = Integer.parseInt(propertiesDate[1]);
              int year = Integer.parseInt(propertiesDate[2]);
              int hour = Integer.parseInt(propertiesTime[0]);
              int minutes = Integer.parseInt(propertiesTime[1]);
              int seconds = Integer.parseInt(propertiesTime[2]);
              try {
                LocalDateTime dt = LocalDateTime.of(year, month, day, hour, minutes, seconds);
                return dt;
              } catch (Exception e) {
                return null;
              }
            }
          }
        }
        return null;
    }

    /**
     * Creates a LocalDateTime object from a String with this format
     * DD/MM/YYYY-hh:mm.
     * 
     * @param date with format DD/MM/YYYY-hh:mm
     * @return a LocalDateTime object or null
     */  
    public static LocalDateTime parseDDMMYYYYhhmm(String date) {
       if (date != null) {
         String[] dateProperties = date.split("-");
         if(dateProperties != null) {
           String[] propertiesDate = dateProperties[0].split("/");
           String[] propertiesTime = dateProperties[1].split(":");
           if ( propertiesDate != null && propertiesTime != null ) {
              int day = Integer.parseInt(propertiesDate[0]);
              int month = Integer.parseInt(propertiesDate[1]);
              int year = Integer.parseInt(propertiesDate[2]);
              int hour = Integer.parseInt(propertiesTime[0]);
              int minutes = Integer.parseInt(propertiesTime[1]);
              try {
                LocalDateTime dt = LocalDateTime.of(year, month, day, hour, minutes);
                return dt;
              } catch (Exception e) {
                return null;
              }
            }
          }
        }
        return null;
    }


    /**
     * Creates a LocalDateTime object from a String with this format DD/MM/YYYY-hh
     * 
     * @param date with format DD/MM/YYYY-hh
     * @return a LocalDateTime object or null
     */
    public static LocalDateTime parseDDMMYYYYhh(String date) {
       if (date != null) {
         String[] dateProperties = date.split("-");
       if(dateProperties != null) {
          String[] propertiesDate = dateProperties[0].split("/");
          if ( propertiesDate != null ) {
              int day = Integer.parseInt(propertiesDate[0]);
              int month = Integer.parseInt(propertiesDate[1]);
              int year = Integer.parseInt(propertiesDate[2]);
              int hour = Integer.parseInt(dateProperties[1]);
              try {
                LocalDateTime dt = LocalDateTime.of(year, month, day, hour, 0);
                return dt;
              } catch (Exception e) {
                return null;
              }
            }
          }
        }
        return null;
    }

    /**
     * Creates a LocalDateTime object from a String with this format DD/MM/YYYY
     * 
     * @param date with format DD/MM/YYYY
     * @return a LocalDateTime object or null
     */
    public static LocalDateTime parseDDMMYYYY(String date) {
       if (date != null) {
         String[] dateProperties = date.split("/");
         if(dateProperties != null) {
            int day = Integer.parseInt(dateProperties[0]);
            int month = Integer.parseInt(dateProperties[1]);
            int year = Integer.parseInt(dateProperties[2]);
            try {
              LocalDateTime dt = LocalDateTime.of(year, month, day, 0, 0);
              return dt;
             } catch (Exception e) {
                return null;
             }
          }
       }
       return null;     
    }

    /**
     * Converts a LocalDateTime into a string with format DD/MM/YYYY-hh:mm:ss.
     * 
     * @param dt a LocalDateTime object
     * @return the formatted String or null
     */
    public static String formatDDMMYYYYhhmmss(LocalDateTime dt) {
        if (dt != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss");
            String formatDateTime = dt.format(formatter);
            return formatDateTime;
        } else {
            return null;
        }
    }

    /**
     * Converts a LocalDateTime into a string with format DD/MM/YYYY-hh:mm.
     * 
     * @param dt a LocalDateTime object
     * @return the formatted String or null
     */
    public static String formatDDMMYYYYhhmm(LocalDateTime dt) {
        if (dt != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm");
            String formatDateTime = dt.format(formatter);
            return formatDateTime;           
        } else {
            return null;
        }
    }

    /**
     * Converts a LocalDateTime into a string with format DD/MM/YYYY-hh.
     * 
     * @param dt a LocalDateTime object
     * @return the formatted String or null
     */
    public static String formatDDMMYYYYhh(LocalDateTime dt) {
        if (dt != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH");
            String formatDateTime = dt.format(formatter);
            return formatDateTime;
        } else {
            return null;
        }
    }

    /**
     * Converts a LocalDateTime into a string with format DD/MM/YYYY
     * 
     * @param dt a LocalDateTime object
     * @return the formatted String or null
     */
    public static String formatDDMMYYYY(LocalDateTime dt) {
        if (dt != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String formatDateTime = dt.format(formatter);
            return formatDateTime;
        } else {
            return null;
        }
    }

    /**
     * Checks if an instant dt is within the time interval (dt1, dt2).
     * 
     * @param dt an instant
     * @param dt1 the lower limit of the interval
     * @param dt2 the upper limit of the interval
     * @return true if dt is within (dt1, dt2), false otherwise
     */
    public static boolean isInInterval(LocalDateTime dt, LocalDateTime dt1, LocalDateTime dt2) {
        if (dt != null && dt1 != null && dt2 != null) {
            boolean cond = dt.isAfter(dt1) && dt.isBefore(dt2);
            return cond;
        }
        return false;
    }

    /**
     * Checks if a time interval (dt1,dt2) is within another time interval (dt3,
     * dt4).
     * 
     * @param dt1 the lower limit of the first interval
     * @param dt2 the upper limit of the first interval
     * @param dt3 the lower limit of the second interval
     * @param dt4 the upper limit of the second interval
     * @return true if (dt1, dt2) is within (dt3, dt4), false otherwise
     */
    public static boolean isInInterval(LocalDateTime dt1, LocalDateTime dt2, LocalDateTime dt3, LocalDateTime dt4) {
        if (dt1 != null && dt2 != null && dt3 != null && dt4 != null) {
            boolean cond = dt1.isAfter(dt3) && dt2.isBefore(dt4);
            return cond;
        }
        return false;
    }

    /**
     * Calculates the number of seconds between two instants dt1 and dt2.
     * 
     * @param dt1 an instant
     * @param dt2 an instant
     * @return the number of seconds
     */
    public static long durationInSeconds(LocalDateTime dt1, LocalDateTime dt2) {     
        if (dt1 != null && dt2 != null) {
            Duration duration = Duration.between(dt1, dt2);
            long seconds = duration.getSeconds();
            return seconds;
        } 
        return 0;
    }
}
