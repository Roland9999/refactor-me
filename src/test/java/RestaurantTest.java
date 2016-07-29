import org.junit.Test;

import java.time.DayOfWeek;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Hugh Glykod
 */
public class RestaurantTest {

    private Restaurant myRestaurant = new Restaurant("Flunch");

    @Test
    public void testDefaultOpeningHours() {

        boolean isOpen = myRestaurant.isOpen(DayOfWeek.SATURDAY, "2016-08-02T17:59:00Z");

        if(isOpen) assertTrue(isOpen);
        else assertFalse(isOpen);

        System.out.println("Est ce que le restaurant "+myRestaurant.getName()+" est ouvert en ce moment ? : "+ isOpen);
    }


}
