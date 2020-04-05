package application;

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean state;

    public Thermometer() {
        this.state = false;
    }

    public void on() {
        this.state = true;
    }

    public void off() {
        this.state = false;
    }

    public boolean isOn() {
        return this.state;
    }

    public int measure() {
        if (this.state = true) {
            Random random = new Random();
            int temp = random.nextInt(60) - 30;
            return temp;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
