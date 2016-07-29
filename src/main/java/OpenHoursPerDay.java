/**
 * Created by Roland on 28/07/2016.
 */
public class OpenHoursPerDay {

    private String openHour = "";
    private String closeHour = "";
    private boolean isAlwaysOpened;

    public OpenHoursPerDay(String openHour, String closeHour){
        this.openHour = openHour;
        this.closeHour = closeHour;
        this.isAlwaysOpened = true;
    }

    public OpenHoursPerDay(String openHour, String closeHour, boolean isAlwaysOpened){
        this.openHour = openHour;
        this.closeHour = closeHour;
        this.isAlwaysOpened = isAlwaysOpened;
    }


    public String getOpenHour() {
        return openHour;
    }

    public void setOpenHour(String openHour) {
        this.openHour = openHour;
    }

    public String getCloseHour() {
        return closeHour;
    }

    public void setCloseHour(String closeHour) {
        this.closeHour = closeHour;
    }

    public boolean isAlwaysOpened() {
        return isAlwaysOpened;
    }

    public void setAlwaysOpened(boolean alwaysOpened) {
        isAlwaysOpened = alwaysOpened;
    }
}
