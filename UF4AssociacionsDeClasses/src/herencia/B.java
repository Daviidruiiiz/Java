package herencia;

public class B extends A{
	public int j;
	
	public B() {
		j = 0;
	}
	public B(int j) {
		super(j);
		this.j = j;
	}
}
