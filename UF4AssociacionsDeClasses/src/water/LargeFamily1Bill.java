package water;

public class LargeFamily1Bill extends Bill{
	
	public LargeFamily1Bill(double consumption, double cleaningUp, double sewerage) {
		super(consumption, cleaningUp, sewerage);
		this.cleaningUpDiscount = 0.25;
		this.sewerageDiscount = 0.25;
	}
    
    @Override
    protected double cleaningUpAmount() {
        return cleaningUp - cleaningUp * cleaningUpDiscount;
    }
    
    @Override
    protected double sewerageAmount() {
        return sewerage - sewerage * sewerageDiscount;
    }
}

