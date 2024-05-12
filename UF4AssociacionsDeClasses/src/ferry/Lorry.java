package ferry;

public class Lorry {
	private String regNumber;
	private double weight;
	private int nAxles;
	
	public Lorry() {
		this.regNumber = "313";
		this.weight = 2345.5;
		this.nAxles = 12;
	}
	public Lorry(String regNumber) {
		this.regNumber = regNumber;
	}
	public Lorry(String regNumber, double weight, int nAxles) {
		this.regNumber = regNumber;
		this.weight = weight;
		this.nAxles = nAxles;
	}
	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null || this.getClass() != object.getClass())
			return false;
		Lorry otherNum = (Lorry) object;
		if(otherNum.regNumber.equals(this.regNumber)) return true;
		return false;
	}
	public int hashCode(){
	    final int prime = 17;
	    int result = 1;
	    result = prime * result + nAxles;
	    return result;
	}
	public int getnAxles() {
		return nAxles;		
	}
	public double getWeight(){
		return weight;
	}
}
