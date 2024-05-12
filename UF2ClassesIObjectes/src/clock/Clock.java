package clock; // Importamos el pack de los sources

import java.time.*; //Importamos las librerias de java.time

public class Clock {
	// Creamos un metodo para agregar la fecha actual 
	public String dateNow() {
		LocalDateTime now = LocalDateTime.now();
		String newDate = JodaDT.formatDDMMYYYYhhmmss(now);
		return newDate;	
	}
}