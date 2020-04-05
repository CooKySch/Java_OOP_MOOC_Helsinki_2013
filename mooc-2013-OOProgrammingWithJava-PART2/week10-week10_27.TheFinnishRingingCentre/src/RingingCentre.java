import java.util.*;

public class RingingCentre {
    private Map<Bird, List<String>> places = new HashMap<Bird, List<String>>();


    public RingingCentre() {}

    public void observe(Bird bird, String place){
        if (!this.places.containsKey(bird)) {
            this.places.put(bird, new ArrayList<String>());
        }
        this.places.get(bird).add(place);
    }

    public void observations(Bird bird) {
        int size = 0;
        if (places.containsKey(bird)) {
            size = places.get(bird).size();
            System.out.println(bird + " observations: " + size);
            for (String observation : places.get(bird)) {
                System.out.println(observation);
            }
        } else {
            System.out.println(bird + " observations: " + size);
        }
    }
}
