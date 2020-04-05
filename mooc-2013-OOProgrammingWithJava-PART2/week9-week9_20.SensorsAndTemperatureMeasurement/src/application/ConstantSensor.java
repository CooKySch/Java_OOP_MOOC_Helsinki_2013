package application;

public class ConstantSensor implements Sensor {
    private int measurement;

    public ConstantSensor(int measurement) {
        this.measurement = measurement;
    }

    public void on() {

    }

    public void off() {

    }

    public boolean isOn() {
        return true;
    }

    public int measure() {
        return measurement;
    }
}
