package containers;

public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory containerHistory = new ContainerHistory();

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        this.containerHistory.add(initialVolume);

    }

    public String history() {
        return this.containerHistory.toString();
    }

    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        this.containerHistory.add(getVolume());
    }

    public double takeFromTheContainer(double amount) {
        double returnValue = super.takeFromTheContainer(amount);
        this.containerHistory.add(getVolume());
        return returnValue;
     }
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + this.containerHistory.maxValue());
        System.out.println("Smallest product amount: " + this.containerHistory.minValue());
        System.out.println("Average: " + this.containerHistory.average());
        System.out.println("Greatest change: " + this.containerHistory.greatestFluctuation());
        System.out.println("Variance: " + this.containerHistory.variance());
}

}
