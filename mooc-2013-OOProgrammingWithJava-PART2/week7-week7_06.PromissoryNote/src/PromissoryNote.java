import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> loans = new HashMap<String, Double>();

    public PromissoryNote() {
    }

    public void setLoan(String toWhom, double value) {
        this.loans.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if(this.loans.containsKey(whose)) {
            return this.loans.get(whose);
        }
        return 0;
    }
}
