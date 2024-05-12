package transports;

public class Bicycle extends Transport {
	private int nGears;
	
	public Bicycle (String id, double speed) {
		super(id, speed);
	}
	public Bicycle (String id, double speed, int nGears) {
		super(id, speed);
		this.nGears = nGears;
	}
	@Override
	public double cost(double distance) {
		return 0;
	}
	public int getNGears() {
		return nGears;	
	}
}
