import org.junit.*;

import static org.junit.Assert.*;


public class DomesticatableJunkerTest {
    DomesticatableJunker CaRTHatHASbEeNDOMeSTiCAteD;

    @Before
    public void setUp() throws Exception {
        CaRTHatHASbEeNDOMeSTiCAteD = new DomesticatableJunker();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("VRRRRRRRRRRRRRRROOOOOOOOOOM", CaRTHatHASbEeNDOMeSTiCAteD.sound());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        CaRTHatHASbEeNDOMeSTiCAteD.upgradeSpeed();
        assertEquals(6, CaRTHatHASbEeNDOMeSTiCAteD.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        CaRTHatHASbEeNDOMeSTiCAteD.downgradeSpeed();
        assertEquals(4, CaRTHatHASbEeNDOMeSTiCAteD.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(70, CaRTHatHASbEeNDOMeSTiCAteD.getPrice());
    }

    @Test(timeout = 50)
    public void TestGetPriceAfterUpgrade(){
        CaRTHatHASbEeNDOMeSTiCAteD.upgradeSpeed();
        assertEquals(80, CaRTHatHASbEeNDOMeSTiCAteD.getPrice());
    }

}