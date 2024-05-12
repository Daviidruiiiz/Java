/*
 * 
 * Company.java
 * 
 * null
 * 
 * Copyright 2024 David Ruiz Parras <davidrp02444@gmail.com>
 * 
 * This is free software, licensed under the GNU General Public License
 * See https://www.gnu.org/licenses/gpl-3.0.html for more information
 */
package contracts;

public class Company {
	
	private int cif;
	private String name;
	private String sector;

	public Company() {
		this.cif = 1001;
		this.name = "Locomotoras INC";
		this.sector = "Mecanico";
	}
	public Company(int cif) {
		this.cif = cif;
	}
	public Company(int cif, String name, String sector) {
		this.cif = cif;
		this.name = name + "";
		this.sector = sector + "";
	}
	
	public boolean equals(Object obj) {
	    // Checking if the other object is null or not of the same class
	    if (this == obj)
	        return true;
	    if (obj == null || this.getClass() != obj.getClass())
	        return false;
	    Company otherCif = (Company) obj;
	    return cif == (otherCif.cif);
	}
	
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + cif;
	    return result;
	}

	int getCif() {
		return cif;
	}
}
