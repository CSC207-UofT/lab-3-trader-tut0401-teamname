import org.junit.*;

import static org.junit.Assert.*;


public class DomesticatableJunkerTest {
    DomesticatableJunker car;

    @Before
    public void setUp() throws Exception {
        car = new DomesticatableJunker();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("VRRRRRRRRRRRRRRROOOOOOOOOOM", car.sound());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        car.upgradeSpeed();
        assertEquals(6, car.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        car.downgradeSpeed();
        assertEquals(4, car.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(70, car.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetPriceAfterUpgrade(){
        car.upgradeSpeed();
        assertEquals(80, car.getPrice());
    }

}