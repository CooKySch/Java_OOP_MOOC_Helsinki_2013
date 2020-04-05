package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    private List<Integer> readings = new ArrayList<Integer>();


    public AverageSensor() {

    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (this.isOn() == false || sensors.isEmpty()){
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.measure();
        }
        int average = sum / sensors.size();
        this.readings.add(average);
        return average;
    }

    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
        this.isOn();
    }

    public List<Integer> readings() {
        return readings;
    }
}
