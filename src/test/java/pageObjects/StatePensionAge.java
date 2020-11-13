package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatePensionAge extends BasePage{
    public StatePensionAge(WebDriver driver) {super(driver);}

    private static final By PENSION_AGE = By.id("overStatePensionAge");
    private static final By PENSION_AGE_UNDER = By.id("overStatePensionAge-2");


    public void clickPensionAge(){driver.findElement(PENSION_AGE).click();}
    public void clickPensionAgeUnder(){driver.findElement(PENSION_AGE_UNDER).click();}




}
