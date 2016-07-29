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

        boolean isOpen = myRestaurant.isOpen(DayOfWeek.WEDNESDAY, "2016-08-02T09:00:00Z");
        assertTrue(isOpen);

        boolean isOpenSunday = myRestaurant.isOpen(DayOfWeek.SUNDAY, "2016-08-02T09:00:00Z");
        assertFalse(isOpenSunday);
    }


}
