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

    public void enterAmount(String amount){
        findAndType(AMOUNT_PAID, amount);
    }
    WebElement radio = driver.findElement(By.cssSelector("input[value=\"an hour\"][type =\"radio\"]"));
    public void clickHowPaidButton(){wait.until(ExpectedConditions.visibilityOf(radio));}
    public void clickContinueButton(){waitAndClick(CONTINUE_BUTTON);};



    /*public void clickCreateAnAccount(){
        waitAndClick(CREATE_NEW_ACCOUNT_BUTTON);
    }

    public void alreadyRegisteredAlertPresent(){
        WebElement alertBox = driver.findElement(ALREADY_REGISTERED_ALERT);
        Assert.assertTrue(elementIsVisible(alertBox));
    }*/


}
