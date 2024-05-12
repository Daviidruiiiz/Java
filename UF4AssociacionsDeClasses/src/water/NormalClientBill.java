package water;

public class NormalClientBill extends Bill {
    
    public NormalClientBill(double consumption, double cleaningUp, double sewerage) {
        super(consumption, cleaningUp, sewerage);
        
    }
    
    @Override
    protected double cleaningUpAmount() {
        return this.cleaningUp;
    }
    
    @Override
    protected double sewerageAmount() {
        return this.sewerage;
    }
}
