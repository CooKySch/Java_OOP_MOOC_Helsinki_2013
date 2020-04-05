package farmsimulator;
import java.util.*;

public class Barn {
    private BulkTank tank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank) {
        this.tank = tank;
        this.milkingRobot = null;
    }

    public BulkTank getBulkTank() {
        return tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        milkingRobot.setBulkTank(this.tank);
        this.milkingRobot = milkingRobot;
    }

    public void takeCareOf(Cow cow) throws IllegalStateException {
        try {
            this.milkingRobot.milk(cow);
        } catch (Exception e) {
            throw new IllegalStateException("Milkingrobot has not been installed.");
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        for (Cow cow : cows) {
            takeCareOf(cow);
        }
    }

    @Override
    public String toString() {
        return this.tank.toString();
    }
}
