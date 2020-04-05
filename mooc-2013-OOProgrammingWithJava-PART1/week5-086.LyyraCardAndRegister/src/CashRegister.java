
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euro
        cashInRegister = 1000.00;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double price = 2.50;
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= price) {
            //    the price of lunch is added to register
            cashInRegister += price;
            //    the amount of sold lunch is incremented by one
            economicalSold++;
            //    method returns cashGiven - lunch price
            return cashGiven - price;
        }
        // if not enough money given, all is returned and nothing else happens
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double price = 4.00;
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= price) {
            //    the price of lunch is added to register
            cashInRegister += price;
            //    the amount of sold lunch is incremented by one
            gourmetSold++;
            //    method returns cashGiven - lunch price
            return cashGiven - price;
        }
        // if not enough money given, all is returned and nothing else happens
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        // price of the gourmet lunch is 2.50 euros
        double price = 2.50;
        // if the given cash is at least the price of the lunch:
        if (card.balance() >= price) {
            //    the amount of sold lunch is incremented by one
            economicalSold++;
            card.pay(price);
            //    method returns true
            return true;
        }
        // if not enough money given, false is returned
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        // price of the gourmet lunch is 4.00 euros
        double price = 4.00;
        // if the given cash is at least the price of the lunch:
        if (card.balance() >= price) {
            //    the amount of sold lunch is incremented by one
            gourmetSold++;
            card.pay(price);
            //    method returns true
            return true;
        }
        // if not enough money given, false is returned
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >= 0) {
            cashInRegister += sum;
            card.loadMoney(sum);
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
