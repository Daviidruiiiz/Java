package counter2Digit;

public class Counter2DigitTUI {
	public static void main(String[] args) {
		Counter1Digit c0 = new Counter1Digit(1);
		Counter1Digit c1 = new Counter1Digit(2);
		Counter2Digit c2 = new Counter2Digit(1,2);
		Counter2Digit c3 = new Counter2Digit(c0,c1);
		Counter2Digit c4 = new Counter2Digit(0, 0);
	}
}
