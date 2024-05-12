package transports;

public abstract class Transport {
    private String id;
    private double speed;

    public Transport(String identificador, double speed) {
        this.id = identificador;
        this.setSpeed(0.0);
    }

    public double time(double distance) {
        return distance / speed;
    }

    public abstract double cost(double distance);

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getId() {
        return id;
    }
}
