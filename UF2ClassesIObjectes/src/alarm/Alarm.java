package alarm;

import java.time.LocalDateTime;
import java.time.Period;

import chronometer.JodaDT;

public class Alarm {
    private LocalDateTime currentDate; // Iniciamos las fechas
    private LocalDateTime dateAlarm;

    // Getter & Setter
    public LocalDateTime getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDateTime currentDate) {
        this.currentDate = currentDate;
    }

    public LocalDateTime getDateAlarm() {
        return dateAlarm;
    }

    public void setDateAlarm(LocalDateTime dateAlarm) {
        this.dateAlarm = dateAlarm;
    }
    
    // Empezamos a añadir fechas
    public void setDate() {
        this.currentDate = LocalDateTime.now();
    }

    public void setAlarmDateTime(int year, int month, int dayOfMonth, int hour, int minute) { // set alarm datetime h & m to 0
        this.dateAlarm = LocalDateTime.of(year, month, dayOfMonth, 0, 0);
    }
    
    public String formattedAlarm() {
    	return JodaDT.formatDDMMYYYY(this.dateAlarm);
    }
    
    // create function to see the interval between dates
    public long intervalBetween() {
    	this.currentDate = LocalDateTime.now();
		long t = JodaDT.durationInSeconds(this.currentDate, this.dateAlarm);
		if (t < 0) {
			return -1;	
		}
		return t;
    }
    
    public String timeLeft() {
    	String tl = null;
    	// set the datatime to now
    	this.currentDate = LocalDateTime.now();
    	if (this.dateAlarm.isAfter(this.currentDate) ) {
    		Period p = Period.between(this.currentDate.toLocalDate(),
    					this.dateAlarm.toLocalDate());
    		tl = p.getYears() + " anys " + p.getMonths() + " mesos " + p.getDays() + " dias ";
    	}
    	return tl;
    }
    public boolean isRinging() {
    	boolean ring;
    	this.currentDate = LocalDateTime.now();
    	ring = currentDate.getYear() == dateAlarm.getYear() &&
    			currentDate.getMonthValue() == dateAlarm.getMonthValue() &&
    			currentDate.getDayOfMonth() == dateAlarm.getDayOfMonth();
    	return ring;		
    }
}
