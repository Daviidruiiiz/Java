package counter2Digit;

public class Counter1Digit {
    private int i, counterMax;

    // Getter
    public int getI() {
        return this.i;
    }
    public int getCounterMax() {
        return this.counterMax;
    }
    // Setter
    public void setCounter1Digit(int counterMax, int i) {
        this.i = i;
        this.counterMax = counterMax;
    }

    // Constructor
    public Counter1Digit(int j) {
        this.i = 0;
        this.counterMax = 10;  // El numero maximo del contador
    }

    // Code for iterate
    public int counter() {
        while (this.i < this.counterMax) {
            System.out.println(this.i);
            this.i++;
        }
        return this.i;
    }
}