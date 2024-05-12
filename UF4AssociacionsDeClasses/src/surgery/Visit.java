/*
 * 
 * Visit.java
 * 
 * Saves the Dates for a surgery
 * 
 * Copyright 2024 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

package surgery;

import java.time.LocalDateTime;

public class Visit {
	// Start all the private default variables
	private String visitDateTime;
	private String patientName;
	
	
	// Start all public methods and variables
	public int hashCode() {
		return 0;
	};
	
	// Get the RightNow date by default date if not are any date
	public Visit() {
		LocalDateTime now = LocalDateTime.now();
		visitDateTime = now + "";
		this.patientName = "Joan Camps";
	}
	// Start the date with the current date and put in String
	public Visit(String visitDateTime) {
		this.visitDateTime = visitDateTime.trim();
	}
	public Visit(String visitDateTime, String patientName) {
		this.visitDateTime = LocalDateTime.now() + "";
		this.patientName = patientName + "";
	}
	@Override
	public boolean equals(Object obj) {
	    // Checking if the other object is null or not of the same class
	    if (obj == null || this.getClass() != obj.getClass())
	        return false;
	    Visit otherVisit = (Visit) obj;
	    // Comparing the visitDateTime and patientName attributes
	    return visitDateTime.equals(otherVisit.visitDateTime) &&
	           patientName.equals(otherVisit.patientName);
	}
	// Getters of the private attributes
	public String getVisitDateTime() {
		return visitDateTime;
	}
	public String getPatientName() {
		return patientName;
	}
	
}
