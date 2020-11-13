package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TaxRate extends BasePage {

    public TaxRate(WebDriver driver) { super(driver);}

    private static final By TAX_RATE = By.id("payScottishRate-2");
    private static final By TAX_CODE = By.id("taxCode");

    public void selectRate(){waitAndClick( TAX_RATE);}
    public void enterTaxCode(String Code){findAndType(TAX_CODE,Code);}



}
