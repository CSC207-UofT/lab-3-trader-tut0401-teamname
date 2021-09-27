
public class DomesticatableJunker implements Domesticatable, Drivable, Tradable{

    private int MaxSpeed;

    public DomesticatableJunker(){
        this.MaxSpeed = 5;
    }

    @Override
    public String sound() {
        return "V" + stringMultiply("RRR", MaxSpeed) + (stringMultiply("OO", MaxSpeed)) + "M";
    }

    @Override
    public void upgradeSpeed() {
        MaxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        MaxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return MaxSpeed;
    }

    @Override
    public int getPrice() {
        return 20 + (10 * getMaxSpeed());
    }

    @Override
    public String toString(){
        String id = super.toString();
        id += " (Max speed:" + getMaxSpeed() + ")";
        return id;
    }

    /**
     * Takes a string and multiplies it, like how strings can be multiplied in python.
     *
     * Returns a string that is OrgString, concatenated with itself x times
     *
     * @param OrgString: the string to be 'multiplied'
     * @param x: the number of times to multiply the string
     * @return a new string that is OrgString concatenated with itself x times
     */

    private static String stringMultiply(String OrgString, int x){ /* Here have this entire method in one line*/ /* Creates the string to be returned */ String newString = ""; /* a for loop that concatenates a string with itself x times */ for (int i = 0; i < x; i++) { /* concatenating the string */ newString += OrgString; } /* returning the string */ return newString; /* An extra comment to emphasize that excess comments are bad */ }
}
