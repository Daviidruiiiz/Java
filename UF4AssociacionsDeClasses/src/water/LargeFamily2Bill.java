package water;

public class LargeFamily2Bill extends Bill{
	
	public LargeFamily2Bill(double consumption, double cleaningUp, double sewerage) {
		super(consumption, cleaningUp, sewerage);
		this.cleaningUpDiscount = 75;
		this.sewerageDiscount = 50;
	}
    
    @Override
    protected double cleaningUpAmount() {
       if ((cleaningUp / 100) * cleaningUp <= 16) {
    	   return cleaningUp - (cleaningUp / 100) * cleaningUpDiscount;
       }
       else {
    	   return cleaningUp - 16;
       }
    }
    @Override
    protected double sewerageAmount() {
        if ((sewerage /100) * sewerage <= 16 ) {
        	return sewerage - (sewerage /100) * sewerageDiscount;
        }
        else {
        	return sewerage -16;
        }
    }
    
    public void details() {
	    System.out.println("Family Bill Details:");
	    System.out.println("Consumption: " + ""	);
	    System.out.println("Cleaning Up: " + cleaningUpAmount());
	    System.out.println("Sewerage: " + sewerageAmount());
	    System.out.println("Total Amount: " + totalAmount());
    }
}
