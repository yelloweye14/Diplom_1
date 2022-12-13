import praktikum.Ingredient;
import praktikum.IngredientType;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class IngredientTest {
    @Test
    public void testGetName() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "sour cream", 200);
        assertEquals("sour cream", ingredient.getName());
    }
    @Test
    public void testGetPrice() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "sour cream", 200);
        assertEquals(200F, ingredient.getPrice(), 0);
    }
    @Test
    public void testGetType() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "sour cream", 200);
        assertEquals(IngredientType.SAUCE, ingredient.getType());
    }
}