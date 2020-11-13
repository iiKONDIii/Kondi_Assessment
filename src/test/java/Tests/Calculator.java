package Tests;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

import static Tests.TestSuite.driverFactory;

public class Calculator {

    public static WebDriver driver = driverFactory.getDriver();

    private HomePage homepage = new HomePage(driver);
    private CalculatorPage calculate = new CalculatorPage(driver);
    private HoursWorkedAWeek hours = new HoursWorkedAWeek(driver);
    private TaxRate taxRate = new TaxRate(driver);
    //private StatePensionAge pensionAge = new StatePensionAge(driver);


    @Before
    public void individualSetUp(){
        homepage.goTo();
    }
    @Test
    public void signInAsRegisteredUser() throws InterruptedException {
        wait(3000);
        calculate.enterAmount("7.50");
        calculate.clickHowPaidButton();
        System.out.println("Test Complete");

    }

    @Test @Ignore
    public void signOut(){

    }
}
