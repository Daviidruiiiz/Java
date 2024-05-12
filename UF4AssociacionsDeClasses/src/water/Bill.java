package water;

public abstract class Bill {
	private double consumption;
	protected double cleaningUp;
	protected double sewerage;
	protected double cleaningUpDiscount;
	protected double sewerageDiscount;
	
	public Bill(double consumption, double cleaningUp, double sewerage) {
		this.consumption = consumption;
		this.cleaningUp = cleaningUp;
		this.sewerage = sewerage;
	}
	private double consumptionAmount() {
		return consumption;
	}
	
	protected abstract double cleaningUpAmount();
	
	protected abstract double sewerageAmount();
	
	public double totalAmount() {
		return cleaningUpAmount() + sewerageAmount() + consumptionAmount();
	}
	public void details() {
	    System.out.println("Bill Details:");
	    System.out.println("Consumption: " + this.consumption);
	    System.out.println("Cleaning Up: " + this.cleaningUpAmount());
	    System.out.println("Sewerage: " + this.sewerageAmount());
	    System.out.println("Total Amount: " + this.totalAmount());
	}

}
