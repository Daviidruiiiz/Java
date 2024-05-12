/*
 * 
 * Surgery.java
 * 
 * null
 * 
 * Copyright 2024 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */

package surgery;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Surgery {
	// Create the default private attributes 
	private String doctorName;
	private String speciality;
	private HashSet<Visit> visits = new HashSet<Visit>();
	
	
	// Create the public methods and attributes
	public Surgery() {
		this.doctorName = "Pedro Lopez Garriga";
		this.speciality = "Cirugía cardiovascular";
		this.visits = new HashSet<Visit>();
	}
	// Get by input the doc name and speciality, add to visits
	public Surgery(String doctorName, String speciality) {
		this.doctorName = doctorName.trim();
		this.speciality = speciality.trim();
		this.visits = new HashSet<Visit>();
	}
	
	//Check if the Visit is programable
	public boolean isProgrammable(Visit visit) {
		boolean equalsTime = false;
		boolean dateInside = false;
		boolean programedInside = false;
		boolean cannotProgram;
		LocalDateTime visitTimeStart = JodaDT.parseDDMMYYYYhhmm(visit.getVisitDateTime());
		LocalDateTime visitEnd = visitTimeStart.plusMinutes(30);
		for ( Visit porgramedVisit : this.visits ) {
			LocalDateTime progamedVisitStart = JodaDT.parseDDMMYYYYhhmm(porgramedVisit.getVisitDateTime());
			LocalDateTime progamedVisitEnd = progamedVisitStart.plusMinutes(30);
			if (visitTimeStart.equals(progamedVisitStart)) equalsTime = true;
			if (JodaDT.isInInterval(visitTimeStart, progamedVisitStart, progamedVisitEnd)) dateInside = true;
			if (JodaDT.isInInterval(progamedVisitStart, visitTimeStart, visitEnd)) programedInside = true;
			cannotProgram = equalsTime || dateInside || programedInside;
			if (cannotProgram) return false;
		}
		return true;
	}
	// Put the visit on the "bag" of visits if its programmable
	public boolean program(Visit visit) {
		boolean programmable = false;
		if (this.isProgrammable(visit)) {
			return this.visits.add(visit);
		}
		return programmable;	
	}
	// Get the size of visits
	public int countVisits() {
	    return this.visits.size();
	}
	// Check if the visit are inside of the schedule of the doctor
	public int countVisits(String date1, String date2) {
		LocalDateTime firstDate = JodaDT.parseDDMMYYYYhhmm(date1);
		LocalDateTime secondDate = JodaDT.parseDDMMYYYY(date2);
		int count = 0;
		for (Visit v : this.visits) {
			LocalDateTime visit = JodaDT.parseDDMMYYYYhhmm(v.getVisitDateTime());
			if (JodaDT.isInInterval(visit, firstDate, secondDate)) count++;
		}
		return count;
	}
	// Remove a specific visit
	public boolean cancel(Visit visit) {
	    return visits.remove(visit);
	}
	// Remove all the visits
	public void cancelAll() {
	    visits.clear();
	}
	public int HashCode() {
		return 0;
		
	}
	
	// Check if the values of the doctror ate the same (to not have the same doctor two times)
	@Override
	public boolean equals(Object obj) {
	    // Checking if the other object is null or not of the same class
	    if (this == obj)
	        return true;
	    if (obj == null || this.getClass() != obj.getClass())
	        return false;
	    // Casting the other object to Surgery
	    Surgery otherSurgery = (Surgery) obj;
	    // Comparing the doctorName and speciality attributes
	    return doctorName.equals(otherSurgery.doctorName) &&
	           speciality.equals(otherSurgery.speciality);
	}
	// Getter of Doctor Name
	public String getDoctorName() {
		return doctorName;
	}
	
	
}
