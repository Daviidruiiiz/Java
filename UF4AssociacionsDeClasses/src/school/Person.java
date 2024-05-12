package school;

public class Person {
	private String name;
	private String address;
	
	public Person() {
		this.name = "Pedro Piqueras Escuela de Arte";
		this.address = "C/ Pedro Piqueras 32";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
