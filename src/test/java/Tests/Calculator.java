package Tests;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import pageObjects.*;

import java.util.function.Function;

import static Tests.TestSuite.driverFactory;

public class Calculator {

    public static WebDriver driver = driverFactory.getDriver();

    private HomePage homepage = new HomePage(driver);
    private CalculatorPage calculate = new CalculatorPage(driver);
    private HoursWorkedAWeek hours = new HoursWorkedAWeek(driver);
    private TaxRate taxRate = new TaxRate(driver);
    private StatePensionAge pensionAge = new StatePensionAge(driver);


    @Before
    public void individualSetUp(){
        homepage.goTo();
    }

    @Test
    public void CompleteJourney()  {
        calculate.enterAmount("7.50");
        calculate.clickHowPaidButton();
        calculate.clickContinueButton();
        hours.enterHoursWorked("15");
        calculate.clickContinueButton();
        pensionAge.clickPensionAge();
        calculate.clickContinueButton();
        taxRate.enterTaxCode("");
        calculate.clickContinueButton();
        taxRate.selectOtherRate();
        calculate.clickContinueButton();
        calculate.clickFinalButton();
        System.out.println("Test Complete");
    }

    @Test
    public void incorrectTaxCode() {
        calculate.enterAmount("7.50");
        calculate.clickHowPaidButton();
        calculate.clickContinueButton();
        hours.enterHoursWorked("15");
        calculate.clickContinueButton();
        pensionAge.clickPensionAgeUnder();
        calculate.clickContinueButton();
        taxRate.enterTaxCode("qwerrtyu");
        calculate.clickContinueButton();
        calculate.checkForError();
        System.out.println("Test Complete");
        /*
         * Expected result is to have the page stop at the enter taxcode due to tax code being incorrect
         *
         * */
    }
      @Test
        public void lowerBoundCheck(){
            calculate.enterAmount("0"); // shouldn't allow as its not real currency
            calculate.clickHowPaidButton();
            calculate.clickContinueButton();
            calculate.checkForError();
            System.out.println("Test Complete");
    }
    @Test
    public void upperBoundCheck(){
        calculate.enterAmount("800000000000000000"); // shouldn't allow as its not real currency
        calculate.clickHowPaidButton();
        calculate.clickContinueButton();
        calculate.checkForError();
        System.out.println("Test Complete");
    }
    @Test
    public void backFunctionalityCheck(){
        calculate.enterAmount("800"); //
        calculate.clickHowPaidButton();
        calculate.clickContinueButton();
        calculate.clickBack();
        calculate.clearAmount();
        calculate.enterAmount("150");
        calculate.clickHowPaidButton2();
        System.out.println("Test Complete");
    }


}
