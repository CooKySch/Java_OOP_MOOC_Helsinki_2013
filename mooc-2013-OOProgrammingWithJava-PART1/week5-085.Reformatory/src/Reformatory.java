public class Reformatory {

    private int totalMeasured = 0;

    public int weight(Person person) {
        // return the weight of the person
        totalMeasured++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int current = person.getWeight();
        person.setWeight(current + 1);
    }

    public int totalWeightsMeasured() {
        return totalMeasured;
    }
}
