/* A Dragon class that implements the given interfaces.
 */
public class Dragon implements Drivable, Domesticatable, Tradable {
    private String name;
    private int maxSpeed;
    private boolean fireBreath;

    public Dragon(String name, boolean domesticated) {
        this.name = name;
        this.maxSpeed = 20;
        fireBreath = domesticated;
    }

    @Override
    public String sound() {
        return "ROAR!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    /**
     * We will pretend that this is documented now./
     **/
    public String breatheFire() {
        if (fireBreath == true) {
            return (this.name + " has laid a city to waste.");
        } else {
            return (this.name + " growls at you.");
        }
    }

    @Override
    public String toString(){
        return this.name + " (Max speed: " + this.maxSpeed +")";
    }
}