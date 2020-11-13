package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HoursWorkedAWeek extends BasePage {

    public HoursWorkedAWeek(WebDriver driver) {
        super(driver);
    }
    private static final By HOUR_WORKED = By.id("how-many-a-week");



    public void enterHoursWorked(String hours){findAndType(HOUR_WORKED,hours);}


}
