package pageObjects;

import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    private static String URL = "https://www.tax.service.gov.uk/estimate-paye-take-home-pay/your-pay";


   public void goTo(){
        driver.get(URL);
   }

}
