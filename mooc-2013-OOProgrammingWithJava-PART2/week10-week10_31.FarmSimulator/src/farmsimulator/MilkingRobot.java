package farmsimulator;

public class MilkingRobot {
    private BulkTank bulkTank;

    public MilkingRobot() {
        this.bulkTank = null;
    }

    public BulkTank getBulkTank() {
        return this.bulkTank;
    }

    public void setBulkTank(BulkTank tank) {
        this.bulkTank = tank;
    }

    public void milk(Milkable milkable) throws IllegalStateException {
        try {
            double volume = milkable.milk();
            this.bulkTank.addToTank(volume);
        } catch (Exception e) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed.");
        }
    }


}
