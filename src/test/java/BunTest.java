import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {
    @Test
    public void getNameBun() {
        Bun bun = new Bun("Булка", 100);
        String actual = bun.getName();
        assertEquals("Булка", actual);
    }

    @Test
    public void getPriceBun() {
        Bun bun = new Bun("Булка", 100);
        float actual = bun.getPrice();
        assertEquals(100, actual, 0);
    }
}
