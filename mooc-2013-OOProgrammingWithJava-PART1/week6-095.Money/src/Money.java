
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int sumCents;
        int sumEuros;
        sumCents = this.cents + added.cents;
        sumEuros = this.euros + added.euros;
        Money sum = new Money(sumEuros, sumCents);
        return sum;
    }

    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return false;
    }

    public Money minus(Money decreased) {
        int diffCents;
        int diffEuros;
        Money difference = new Money(0,0);
        diffEuros = this.euros - decreased.euros;
        diffCents = this.cents - decreased.cents;
        if (diffCents < 0) {
            diffCents = 100 + diffCents;
            diffEuros--;
        }
        if (diffEuros < 0) {
            return difference;
        } else if (diffEuros == 0) {
            if (diffCents < 0) {
                return difference;
            }
        } else {
            difference = new Money(diffEuros, diffCents);
        }
        return difference;
    }
}
