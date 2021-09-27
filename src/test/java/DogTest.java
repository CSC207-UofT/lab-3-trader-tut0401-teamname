import org.junit.*;

import static org.junit.Assert.assertEquals;

public class DogTest {
    Dog d;

    @Before
    public void setUp() {
        d = new Dog("Don", 5);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Bow-wow!", d.sound());
    }

    @Test(timeout = 50)
    public void TestName() {
        assertEquals("Don", d.getName());
    }
}
