package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CalculatorPage extends BasePage {

    public CalculatorPage(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, 5000);

    private static final By AMOUNT_PAID= By.id("amount");
    private static final By CONTINUE_BUTTON = By.id("button-continue");
    private static final By GET_RESULTS = By.id("button-get-results");
    private static final By GO_BACK = By.cssSelector("[class=\"govuk-back-link\"]");
    public static final By ERROR_PAGE = By.id("error-summary-title");
    /*//WebElement radio = driver.findElement(By.cssSelector("input[value=\"an hour\"][type =\"radio\"]"));
     this didn't work due to not being put into a method
     */
    private static final By RADIO = By.id("period");
    private static final By RADIO2 = By.id("period-2");

    public void enterAmount(String amount){
        findAndType(AMOUNT_PAID, amount);
    }
    public void checkForError(){elementIsVisible(ERROR_PAGE.findElement(driver));}
    public void clickHowPaidButton(){driver.findElement(RADIO).click();}
    public void clickHowPaidButton2(){driver.findElement(RADIO2).click();}
    public void clickBack(){driver.findElement(GO_BACK).click();}
    public void clickContinueButton(){waitAndClick(CONTINUE_BUTTON);};
    public void clickFinalButton(){waitAndClick(GET_RESULTS);}
    public void clearAmount (){driver.findElement(By.id("amount")).clear();}

}
