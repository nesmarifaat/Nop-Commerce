package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static pages.PageBase.longWait;

public class P01_HomePage {

    //1- Define Webdriver
    WebDriver driver;

    //2-Define Constractor

    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //3- Define Locators and action methods

    private final By registerTap = By.xpath("//a[@href='/register?returnUrl=%2F']");

    public P01_HomePage clickonregistrationtap() {
        try {
            longWait(driver).until(ExpectedConditions.elementToBeClickable(this.registerTap));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
        driver.findElement(this.registerTap).click();
        return this;
    }

    private final By loginTap = By.xpath("//a[@href='/login?returnUrl=%2F']");

    public P01_HomePage clickonlogintap() {
        try {
            longWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.loginTap));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
        driver.findElement((this.loginTap)).click();
        return this;
    }


}
