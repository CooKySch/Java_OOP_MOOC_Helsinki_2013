
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment) {
        int difference = this.squareMeters * this.pricePerSquareMeter - otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        if (difference >= 0) {
            return difference;
        } else {
            return -1 * difference;
        }
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int difference = this.squareMeters * this.pricePerSquareMeter - otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        if (difference > 0) {
            return true;
        }
        return false;
    }
}
