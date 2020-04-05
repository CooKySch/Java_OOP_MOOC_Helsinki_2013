package containers;

import java.util.*;

public class ContainerHistory {
    private List<Double> history = new ArrayList<Double>();

    public ContainerHistory() {

    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        double finalValue = history.get(0);
        for (double value : history) {
            if (value > finalValue) {
                finalValue = value;
            }
        }
        return finalValue;
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        double finalValue = history.get(0);
        for (double value : history) {
            if (value < finalValue) {
                finalValue = value;
            }
        }
        return finalValue;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double value : history) {
            sum += value;
        }
        return sum / history.size();
    }

    public double greatestFluctuation() {
        double maxFluctuation = 0;
        if (history.size() <= 1) {
            return maxFluctuation;
        }
        double previousValue = history.get(0);
        for (double value : history) {
            double currentValue = value;
            if (maxFluctuation < Math.abs(previousValue - currentValue)) {
                maxFluctuation = Math.abs(previousValue - currentValue);
            }
            previousValue = currentValue;
        }
        return maxFluctuation;
    }

    public double variance() {
        double variance = 0;
        if (history.size() <= 1) {
            return variance;
        }
        double average = this.average();
        for (double value : history) {
            variance += Math.pow((value - average), 2.0);
        }
        return variance / (history.size() - 1.0);
    }
}
