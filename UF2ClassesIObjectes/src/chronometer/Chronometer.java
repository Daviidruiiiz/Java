package chronometer;

import java.time.LocalDateTime;

public class Chronometer {
	private LocalDateTime date1; // Iniciamos las fechas
	private LocalDateTime date2;
	
	//  Getters & setters
	public LocalDateTime getDate1() {
		return date1;
	}
	public void setDate1(LocalDateTime date1) {
		this.date1 = date1;
	}
	public LocalDateTime getDate2() {
		return date2;
	}
	public void setDate2(LocalDateTime date2) {
		this.date2 = date2;
	}
	
	public Chronometer() { // Start the 
		this.date1 = null;
		this.date2 = null;
	}
	public void start() {
		this.date1 = LocalDateTime.now();
	}
	public void stop() {
		this.date2 = LocalDateTime.now();
	}
	public void restart() {
		this.start();
		this.setDate2(null); // implica borrar el contador de date2
	}
	public String timeInterval() {
		if(this.date1 != null && this.date2 != null) {
			long timeInSeconds = JodaDT.durationInSeconds(this.date1, this.date2);
				long hours = timeInSeconds / 3600;
				timeInSeconds = timeInSeconds - (hours * 3600);
				long minutes = timeInSeconds / 60;
				timeInSeconds = timeInSeconds - (minutes * 60);
				return hours + ":" + minutes + ":" + timeInSeconds;
		}
		return null;
	}
}
