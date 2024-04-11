import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testCompute() {
        App app = new App();

        Meal meal = new Meal("couscous", MealType.PLATE);
        Beverage beverage = new Beverage("coca", BeverageSize.MEDIUM);
        Dessert dessert = new Dessert("baba", DessertSize.NORMAL);
        boolean coffee = true;

        int price = app.Compute(meal, beverage, dessert, coffee);

        assertEquals(18, price);
    }

}