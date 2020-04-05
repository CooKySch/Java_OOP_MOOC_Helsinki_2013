package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private Collection<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    @Override
    public String toString() {
        String output = "";
        output += "Farm owner: " + owner + "\nBarn bulk tank: " + barn.toString();
        if (this.cows.size() == 0) {
            output += "\nNo cows.";;
        } else {
            output += "Animals:\n";
            for (Cow cow : cows) {
                output += cow;
            }
        }
        return output;
    }

    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }

    public void manageCows() {
        this.barn.takeCareOf(this.cows);
    }

    public String getOwner() {
        return this.owner;
    }

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.barn.installMilkingRobot(milkingRobot);
    }
}
