package parking;

import java.util.HashSet;

public class Parking {
    private int nSpaces;
    private Vehicle[] spaces;


    public Parking(int nSpaces) {
    	this.nSpaces = nSpaces;
    }

    public boolean add(Vehicle v, int ns) {
    	return true;
    }

    public Vehicle remove(int ns) {
    	remove(ns);
    }

    public double calculateFee();

    public double calculateTotal() {
    	
    }

    public void reportTotal(String pathReport) {
    }
}