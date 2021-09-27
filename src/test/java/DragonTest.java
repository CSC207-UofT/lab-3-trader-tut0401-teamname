import org.junit.*;

import static org.junit.Assert.*;


public class DragonTest {
    Dragon d;

    @Before
    public void setUp() throws Exception {
        d = new Dragon("Drogon", true);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("ROAR!", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(20, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        d.upgradeSpeed();
        assertEquals(21, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        d.downgradeSpeed();
        assertEquals(19, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1000, d.getPrice());
    }

    @Test(timeout = 50)
    public void TestToString() {
        assertEquals("Drogon (Max speed: 20)", d.toString());
    }

    @Test
    public void breatheFire() {
        assertEquals("Drogon has laid a city to waste.", d.breatheFire());
    }
}