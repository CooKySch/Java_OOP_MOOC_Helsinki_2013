public class CivilService implements NationalService {
    int daysLeft;

    public CivilService() {
        daysLeft = 362;
    }

    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        if (this.daysLeft > 0) {
            daysLeft--;
        }
    }
}
