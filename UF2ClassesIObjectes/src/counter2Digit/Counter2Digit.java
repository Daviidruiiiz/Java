	package counter2Digit;
	
	import counter1Digit.Counter1Digit;
	
	public class Counter2Digit {
		// Attributes
		/* Units counter */
		private Counter1Digit counterUnits;
		/* Tens counter */
		private Counter1Digit counterTens;
		//Setters y getters
		public Counter1Digit getCounterTens() {
			return counterTens;
		}
		public void setCounterTens(Counter1Digit counterTens) {
			this.counterTens = counterTens;
		}
		public Counter1Digit getCounterUnits() {
			return counterUnits;
		}
		public void setCounterUnits(Counter1Digit counterUnits) {
			this.counterUnits = counterUnits;
		}
		public void Counter2Digits() {
		this.counterUnits = new Counter1Digit(0);
		this.counterTens = new Counter1Digit(0);
		
		}
		public Counter2Digit(Counter1Digit c0, Counter1Digit c1) {
			this.counterUnits = c0;
			this.counterTens = c1;
		}
		public Counter2Digit(int unit, int tens) {
			this.counterUnits = new Counter1Digit(unit);
			this.counterTens = new Counter1Digit(tens);
		}
		public Counter2Digit(counter2Digit.Counter1Digit c0, counter2Digit.Counter1Digit c1) {
			// TODO Auto-generated constructor stub
		}
	}
