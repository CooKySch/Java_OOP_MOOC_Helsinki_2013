package dungeon;
import java.util.*;

public class Dungeon {
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private Scanner reader = new Scanner(System.in);
    private Player player = new Player();
    private Random random = new Random();


    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
    }

    public void run() {
        List<Vampire> vampires = setVampires(this.vampires);
        boolean status = false;
        while (this.moves >= 1) {
            printDungeon(vampires);
            String input = this.reader.nextLine();
            for (int i = 0; i < input.length(); i++) {
                player.move(input.charAt(i), height-1, length-1);
                    vampiresMove(vampires);
                    status = checkAndKillVampires(vampires);

            }
            moves--;
            if (status) {
                System.out.println("YOU WIN");
                break;
            }
            if (moves == 0) {
                System.out.println("YOU LOSE");
            }
        }
    }

    //prints the dungeon
    public void printDungeon(List<Vampire> vampires) {
        System.out.println(this.moves + "\n");

        System.out.println(player);
        for (Vampire vampire : vampires) {
            System.out.println(vampire);
        }
        System.out.println("");

        int y = 0;
        while (y < this.height) {
            int x = 0;
            while (x < this.length) {
                if (x == player.getX() && y == player.getY()) {
                    System.out.print("@");
                    x++;
                } else {
                    for (Vampire vampire : vampires) {
                        if (x == vampire.getX() && y == vampire.getY()) {
                            System.out.print("v");
                            x++;
                        }
                    }
                    if (x < this.length) {
                        System.out.print(".");
                        x++;
                    }
                }
            }
            System.out.print("\n");
            y++;
        }
    }

    //returns an arraylist containing the vampires. These are appointed random spots and cannot be on the same spot
    private List<Vampire> setVampires(int numberOfVampires) {
        List<Vampire> vampires = new ArrayList<Vampire>();
        int i = 0;
        while (i < numberOfVampires) {
            int x = this.random.nextInt(length);
            int y = this.random.nextInt(height);
            boolean place = true;
            if (this.player.getX() == x && this.player.getY() == y) {
                place = false;
            }
            else if (vampires.size() > 0) {
                for (Vampire vampire : vampires) {
                    if (x == vampire.getX() && y == vampire.getY()) {
                        place = false;
                    }
                }
            }
            if (place) {
                vampires.add(new Vampire(x, y, this.vampiresMove));
                i++;
            }
        }
        return vampires;
    }

    //allows the vampires to move. Movements are random and vampires cannot be on the same spot.
    public void vampiresMove(List<Vampire> vampires) {
        if (this.vampiresMove) {
            int i = 0;
            while (i < vampires.size()) {
                int move = -1;
                boolean isAllowedToMove = false;
                while (!isAllowedToMove) {
                    move = random.nextInt(4);
                    isAllowedToMove = isAllowedToMove(vampires.get(i), vampires, move);
                    if (isAllowedToMove) {
                        vampires.get(i).move(move);
                        i++;
                    }
                }
            }
        }
    }

    public boolean isAllowedToMove(Vampire vampire, List<Vampire> vampires, int move) {
        Vampire nextVampire = new Vampire(vampire.getX(), vampire.getY(), vampiresMove);
        nextVampire.move(move);
        if (nextVampire.getX() < 0 || nextVampire.getX() > this.length -1) {
            return false;
        }
        if (nextVampire.getY() < 0 || nextVampire.getY() > this.height -1) {
            return false;
        }
        if (vampires.size() > 1) {
            for (Vampire otherVampire : vampires) {
                if (nextVampire.getY() == otherVampire.getY() && nextVampire.getX() == otherVampire.getX()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkAndKillVampires(List<Vampire> vampires) {
        List<Vampire> toBeRemoved = new ArrayList<Vampire>();
        for (Vampire vampire : vampires) {
            if (player.getX() == vampire.getX() && player.getY() == vampire.getY()) {
                toBeRemoved.add(vampire);
            }
        }
        vampires.removeAll(toBeRemoved);
        if (vampires.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
