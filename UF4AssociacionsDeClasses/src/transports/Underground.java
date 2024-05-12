
package transports;

public class Underground extends Transport {
    private double ticketPrice;

    public Underground(String id, double speed) {
        super(id, speed);
    }

    public Underground(String id, double speed, double ticketPrice) {
        super(id, speed);
        this.ticketPrice = ticketPrice;
    }

	@Override
	public double cost(double distance) {
		return this.ticketPrice;
	}

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
