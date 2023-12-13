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

    public P01_HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    //3- Define Locators and action methods

    private final By registerTap=By.xpath("//a[@href='/register?returnUrl=%2F']");

    public P01_HomePage clickonregistrationtap()
    {
        driver.findElement(this.registerTap).click();
        return this;
    }
    private final By loginTap=By.xpath("//a[@href='/login?returnUrl=%2F']");

    public P01_HomePage clickonlogintap()
    {
        driver.findElement((this.loginTap)).click();
        return this;
    }














//    //TODO: 1- define constructor include page factory
//    public P01_HomePage(WebDriver driver){
//        PageFactory.initElements(driver,this);
//    }
//    //TODO: 2- define locators
//    @FindBy(xpath = "//a[@href='/register?returnUrl=%2F']")
//    WebElement registerTap;
//
//    @FindBy(xpath = "//a[@href='/login?returnUrl=%2F']")
//    WebElement loginTap;
//
//    //TODO: 3- define action methods
//    public void clickRegisterTap(){
//        this.registerTap.click();
//    }
//    public void clickLoginTap(){
//        this.loginTap.click();
//    }
}
