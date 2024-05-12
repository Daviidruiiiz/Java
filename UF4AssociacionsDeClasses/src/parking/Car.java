package parking;

public class Car extends Vehicle {
    private int nSeats;

    public Car(String regPlate, int power, int nSeats) {
        super(regPlate, power);
        this.nSeats = nSeats;
    }
    @Override
    public double calculateFee() {
        return power * nSeats;
    }

    public int getnSeats() {
        return nSeats;
    }
}