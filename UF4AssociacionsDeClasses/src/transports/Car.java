package transports;

public class Car extends Transport {
	private String fuelType;
	private double literPrice;
	private double litersKm;
	
	public Car(String id, double speed) {
		super(id, speed);
	}
	public Car(String id, double speed, String fuelType, double literPrice, double litersKm) {
		super(id, speed);
		this.fuelType = fuelType;
		this.literPrice = literPrice;
		this.litersKm = litersKm;
	}
	@Override
	public double cost(double distance) {
		return distance * literPrice * litersKm;
	}
	public String getFuelType() {
		return fuelType;
	}
	public double getLitersKm() {
		return litersKm;
	}
}
