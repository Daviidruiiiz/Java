package parking;

public abstract class Vehicle {
	private String regPlate;
	protected int power;
	
	public Vehicle(String regPlate, int power) {
		this.regPlate = regPlate;
		this.power = power;
	}
	
	public abstract double calculateFee();
	
	public String getRegPlate() {
		return regPlate;
	}
	public boolean equals(Object obj) {
	    // Checking if the other object is null or not of the same class
	    if (this == obj)
	        return true;
	    if (obj == null || this.getClass() != obj.getClass())
	        return false;
	    // Casting the other object to Vehicle
	    Vehicle otherVehicle = (Vehicle) obj;
	    // Comparing the regPlate and speciality attributes
	    return regPlate.equals(otherVehicle.regPlate);
	}
	public int hashCode() {
		return 1;
	}
	
}
