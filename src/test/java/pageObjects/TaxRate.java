package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TaxRate extends BasePage {

    public TaxRate(WebDriver driver) { super(driver);}

    private static final By TAX_RATE_DONT = By.id("payScottishRate-2");
    private static final By TAX_RATE_DO = By.id("payScottishRate");
    private static final By TAX_CODE = By.id("taxCode");

    public void selectRate(){driver.findElement(TAX_RATE_DONT).click();}
    public void selectOtherRate(){driver.findElement(TAX_RATE_DONT).click();}
    public void enterTaxCode(String Code){findAndType(TAX_CODE,Code);}



}
