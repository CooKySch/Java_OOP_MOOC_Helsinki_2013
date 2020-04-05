package farmsimulator;

import javax.xml.stream.events.Namespace;
import java.lang.reflect.Array;
import java.util.Random;

public class Cow implements Milkable, Alive{
    private String name;
    private double capacity;
    private double volume;
    private Random random = new Random();

    public Cow(String name) {
        this.name = name;
        this.capacity = random.nextInt(15) + 20;
        this.volume = 0;
    }

    public Cow() {
        int nameNumber = random.nextInt(NAMES.length);
        this.name = NAMES[nameNumber];
        this.capacity = random.nextInt(15) + 20;
        this.volume = 0;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getAmount() {
        return this.volume;
    }

    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }

    @Override
    public double milk() {
        double milk = this.volume;
        this.volume = 0;
        return milk;
    }

    public void liveHour() {
        double producedMilk = random.nextDouble()*1.3 + 0.7;
        if (this.volume + producedMilk < this.capacity) {
            this.volume += producedMilk;
        } else {
            this.volume = this.capacity;
        }
    }

    private String pickName() {
        return NAMES[this.random.nextInt(31)];
    }

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
}
