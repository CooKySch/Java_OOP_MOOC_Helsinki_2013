
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object tocompare) {
        if (tocompare == null) {
            return false;
        }

        if (getClass() != tocompare.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) tocompare;

        if (this.regCode != compared.regCode) {
            return false;
        }

        if (this.country != compared.country) {
            return false;
        }
        return true;
    }


    public int hashCode() {
        if (this.regCode == null) {
            return 0;
        }
        if (this.country == null)
            return 0;

        return this.country.hashCode() + this.regCode.hashCode();
    }
}