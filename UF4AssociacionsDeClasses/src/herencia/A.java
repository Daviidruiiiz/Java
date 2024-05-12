package herencia;

class A {
	int i;
	
	public A() {
		System.out.println("En A");
		i = 0;
	}
	public A(int i) {
		System.out.println("en A con parametro");
		this.i = i;
	}
}


