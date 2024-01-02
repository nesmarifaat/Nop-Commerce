package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


import java.util.List;
import java.util.Random;

import static java.lang.System.setProperty;
import static pages.PageBase.shortWait;
import static utilities.Utility.generateRandomEmail;


public class P03_Login {

    //1- Define Webdrive;
    WebDriver driver;

    //2- Define constractor and intialize driver
    public P03_Login(WebDriver driver) {
        this.driver = driver;
    }
    //**********************************************************************************//


    //3-Define Locators
    private final By email = By.xpath("//input[@class='email']");


    //TODO: fill email locator and method
    public P03_Login fillemail(String email) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.email));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
        driver.findElement(this.email).sendKeys(email);
        return this;
    }
    //**********************************************************************************//
    //TODO: fill password locator and method

    private final By password = By.xpath("//input[@class='password']");

    public P03_Login fillpassword(String password) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.password));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
        driver.findElement(this.password).sendKeys(password);
        return this;
    }

    //**********************************************************************************
    //TODO: login button locator and method
    private final By loginbutton = By.xpath("//button[@class='button-1 login-button']");

    public P03_Login clickloginbutton() {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(this.loginbutton));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
        driver.findElement(this.loginbutton).click();
        return this;
    }

    //**********************************************************************************
    //TODO: Reset password locator and method
    private final By resetpassword = By.xpath("//a[@href='/passwordrecovery']");

    public P03_Login clickonforgetpassword() {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(this.resetpassword));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }

        driver.findElement(this.resetpassword).click();
        return this;
    }
    //**********************************************************************************
    //TODO: fill email to reset password locator and method

    private final By resetpasswordemail = By.xpath("//input[@class='email']");

    public P03_Login fillemailtoresetpassword(String email) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.resetpasswordemail));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
        driver.findElement(this.resetpasswordemail).sendKeys(email);
        return this;
    }

    //**********************************************************************************
    //TODO: Recover button locator and method
    private final By recoverbutton = By.xpath("//button[@name='send-email']");

    public P03_Login clickonrecoverbutton() {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(this.recoverbutton));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
        driver.findElement(this.recoverbutton).click();
        return this;
    }

    private final By unsuccessfullogin=By.xpath("//div[@class=\"message-error validation-summary-errors\"]");

    public Boolean validateununsuccessfullogin(){
        return driver.findElement(this.unsuccessfullogin).isDisplayed();
    }

    private final By emailnotfound=By.xpath("//p[@class=\"content\"]");

    public Boolean validatewrongemailmsg(){
        return driver.findElement(this.emailnotfound).isDisplayed();
    }

    private final By instructionsent=By.xpath("//p[@class=\"content\"]");

    public Boolean validaterestpassmsg(){
        return driver.findElement(this.instructionsent).isDisplayed();
    }


}








