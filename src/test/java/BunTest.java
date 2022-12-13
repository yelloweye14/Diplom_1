import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class BunTest {

    private final String name;
    private final float price;
    private final Bun bun;

    public BunTest(String name, float price, Bun bun) {
        this.name = name;
        this.price = price;
        this.bun = bun;

    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {"Булка", 100F, new Bun("Булка", 100F)},
                {null, (float) 0.1, new Bun(null, (float) 0.1)},
                {"!@#$%^&*(),.-", (float) 1.1234567, new Bun("!@#$%^&*(),.-", (float) 1.1234567)},
                {"Bun1", (float) -0.1, new Bun("Bun1", (float) -0.1)},
                {"包子", 0, new Bun("包子",0)},
                {"", Float.MAX_VALUE, new Bun("", Float.MAX_VALUE)},
                {"5", Integer.MAX_VALUE, new Bun(String.valueOf("Булка".length()), Integer.MAX_VALUE)}

        };
    }

    @Test
    public void bunTest() {
        Bun actualBun = new Bun(name, price);
        assertEquals("Некорректное наименование", bun.getName(), actualBun.getName());
        assertTrue("Некорректная цена",Math.abs(bun.getPrice() - actualBun.getPrice()) < 0.0000001);
    }
}
