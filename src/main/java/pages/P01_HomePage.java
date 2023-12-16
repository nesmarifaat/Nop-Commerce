package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
        driver.findElement(this.registerTap).click();
        return this;
    }

    private final By loginTap = By.xpath("//a[@href='/login?returnUrl=%2F']");

    public P01_HomePage clickonlogintap() {
        driver.findElement((this.loginTap)).click();
        return this;
    }


}
