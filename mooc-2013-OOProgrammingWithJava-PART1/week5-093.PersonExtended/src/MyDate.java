
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public MyDate clone(){
        MyDate clone = new MyDate(this.day, this.month, this.year);
        return clone;
    }

    public int differenceInYears(MyDate comparedDate) {
        MyDate earlierDate;
        MyDate laterDate;
        if (this.earlier(comparedDate)) {
            earlierDate = this.clone();
            laterDate = comparedDate.clone();
        } else {
            earlierDate = comparedDate.clone();
            laterDate = this.clone();
        }
        int differenceInYears = laterDate.year - earlierDate.year;
        int differenceInMonths = laterDate.month - earlierDate.month;
        int differenceInDays = laterDate.day - earlierDate.day;
        if (differenceInDays < 0) {
            differenceInMonths--;
        }
        if (differenceInMonths < 0) {
            differenceInYears--;
        }
        return differenceInYears;
    }
}