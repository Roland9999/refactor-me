import org.junit.Test;
import peo.java.test.restaurant.Restaurant;

import java.time.DayOfWeek;

/**
 * @author Hugh Glykod
 */
public class RestaurantTest {

    private Restaurant myRestaurant = new Restaurant("Flunch");

    @Test
    public void testDefaultOpeningHours() {

        boolean isOpen = myRestaurant.isOpen(DayOfWeek.MONDAY);

        System.out.println("Est ce que le restaurant "+myRestaurant.getName()+" est ouvert en ce moment ? : "+ isOpen);
    }


}
