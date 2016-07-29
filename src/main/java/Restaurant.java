import java.time.*;
import java.util.*;

/**
 * @author Hugh Glykod
 */
public class Restaurant {

    private String name;

    private Map<DayOfWeek,OpenHoursPerDay> myHours;

    public Restaurant(String name){
        this.name = name;
        myHours = new HashMap<>();
        myHours.put(DayOfWeek.MONDAY, new OpenHoursPerDay("09:00","20:00"));
        myHours.put(DayOfWeek.TUESDAY, new OpenHoursPerDay("09:00","20:00"));
        myHours.put(DayOfWeek.WEDNESDAY, new OpenHoursPerDay("09:00","20:00"));
        myHours.put(DayOfWeek.THURSDAY, new OpenHoursPerDay("09:00","20:00"));
        myHours.put(DayOfWeek.FRIDAY, new OpenHoursPerDay("09:00","20:00"));
        myHours.put(DayOfWeek.SATURDAY, new OpenHoursPerDay("09:00","20:00"));
        myHours.put(DayOfWeek.SUNDAY, new OpenHoursPerDay("00:00","00:00",false));
    }

    public boolean isOpen(DayOfWeek day, String instant) {

        return getMyHours().get(day).isAlwaysOpened() && (LocalTime.now(Clock.fixed(Instant.parse(instant), ZoneId.of("Europe/Paris"))).isAfter(LocalTime.parse(getMyHours().get(day).getOpenHour())) &&
                LocalTime.now(Clock.fixed(Instant.parse(instant), ZoneId.of("Europe/Paris"))).isBefore(LocalTime.parse(getMyHours().get(day).getCloseHour())));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<DayOfWeek, OpenHoursPerDay> getMyHours() {
        return myHours;
    }

    public void setMyHours(Map<DayOfWeek, OpenHoursPerDay> myHours) {
        this.myHours = myHours;
    }
}
