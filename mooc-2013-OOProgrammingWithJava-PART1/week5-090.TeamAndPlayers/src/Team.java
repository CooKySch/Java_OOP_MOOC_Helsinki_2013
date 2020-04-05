import java.util.ArrayList;

public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (players.size() < maxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers() {
        String allPlayers = "";
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        if (maxSize > 0) {
            this.maxSize = maxSize;
        }
    }

    public int size() {
        return players.size();
    }

    public int goals() {
        int goals = 0;
        for (Player player : players) {
            goals += player.goals();
        }
        return goals;
    }
}
