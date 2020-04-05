public class Counter {

    public int value;
    public boolean check;

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, true);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase(int increaseamount) {
        if (increaseamount >= 0) {
            this.value += increaseamount;
        }
    }

    public void increase() {
        this.increase(1);
    }

    public void decrease(int decreaseamount) {
        if (decreaseamount >= 0) {
            if (this.value - decreaseamount < 0) {
                if (!this.check) {
                    this.value -= decreaseamount;
                } else {
                    this.value = 0;
                }
            } else {
                this.value -= decreaseamount;
            }
        }
    }

    public void decrease() {
        this.decrease(1);
    }
}
