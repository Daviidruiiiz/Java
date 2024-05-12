package parking;

public class Motorbike extends Vehicle {

	public Motorbike(String regPlate, int power) {
        super(regPlate, power);
	}
	public double calculateFee() {
		return power * 2;
	}
}
