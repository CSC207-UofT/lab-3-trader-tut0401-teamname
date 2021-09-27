
public class DomesticatableJunker implements Domesticatable, Drivable, Tradable{

    private int maxSpeed;

    public DomesticatableJunker(){
        this.maxSpeed = 5;
    }

    @Override
    public String sound() {
        return "V" + stringMultiply("RRR", maxSpeed) + (stringMultiply("OO", maxSpeed)) + "M";
    }

    @Override
    public void upgradeSpeed() {
        maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
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

    private static String stringMultiply(String OrgString, int x) {
        String newString = "";
        for (int i = 0; i < x; i++) {
            newString += OrgString;
        }
        return newString;
    }
}
