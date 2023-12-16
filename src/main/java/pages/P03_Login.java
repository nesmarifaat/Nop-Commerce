package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.util.List;
import java.util.Random;

import static java.lang.System.setProperty;
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
        driver.findElement(this.email).sendKeys(email);
        return this;
    }
    //**********************************************************************************//
    //TODO: fill password locator and method

    private final By password = By.xpath("//input[@class='password']");

    public P03_Login fillpassword(String password) {
        driver.findElement(this.password).sendKeys(password);
        return this;
    }

    //**********************************************************************************
    //TODO: login button locator and method
    private final By loginbutton = By.xpath("//button[@class='button-1 login-button']");

    public P03_Login clickloginbutton() {
        driver.findElement(this.loginbutton).click();
        return this;
    }

    //**********************************************************************************
    //TODO: Reset password locator and method
    private final By resetpassword = By.xpath("//a[@href='/passwordrecovery']");

    public P03_Login clickonforgetpassword() {
        driver.findElement(this.resetpassword).click();
        return this;
    }
    //**********************************************************************************
    //TODO: fill email to reset password locator and method

    private final By resetpasswordemail = By.xpath("//input[@class='email']");

    public P03_Login fillemailtoresetpassword(String email) {
        driver.findElement(this.resetpasswordemail).sendKeys(email);
        return this;
    }

    //**********************************************************************************
    //TODO: Recover button locator and method
    private final By recoverbutton = By.xpath("//button[@name='send-email']");

    public P03_Login clickonrecoverbutton() {
        driver.findElement(this.recoverbutton).click();
        return this;
    }


}








