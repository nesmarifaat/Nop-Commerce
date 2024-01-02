package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static pages.PageBase.longWait;
import static pages.PageBase.shortWait;


public class P02_Registration {
    //1- Define Webdriver
    WebDriver driver;


    //2- Define Constractor

    public P02_Registration(WebDriver driver) {
        this.driver = driver;
    }


    //TODO: Gender Locator and method
    private final By gender = By.id("gender-male");

    public P02_Registration choosegender() {
        try {
            longWait(driver).until(ExpectedConditions.elementToBeClickable(this.gender));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
        driver.findElement(this.gender).click();
        return this;
    }

    //**********************************************************************************//
    //TODO: Firstname locator and method
    private final By firstname = By.id("FirstName");

    public P02_Registration fillfirstname(String firstname) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.firstname));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
        driver.findElement(this.firstname).sendKeys(firstname);
        return this;
    }

    //**********************************************************************************//
    //TODO: Lastname locator and method
    private final By lastname = By.id("LastName");

    public P02_Registration filllastname(String lastname) {
        driver.findElement(this.lastname).sendKeys(lastname);
        return this;
    }

    //**********************************************************************************//
    //TODO: Day of Birth locator and method
    private final By dayofbirth = By.xpath("//select[@name='DateOfBirthDay']");

    public P02_Registration selectdayofbirth(int index) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.dayofbirth));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }

        WebElement dayofbirth = (WebElement) driver.findElement(this.dayofbirth);

        Select randomday = new Select(dayofbirth);
        randomday.selectByIndex(index);
        return this;
    }

    //**********************************************************************************
    //TODO: Month of Birth locator and method
    private final By month = By.xpath("//select[@name='DateOfBirthMonth']");

    public P02_Registration selectmonth(int index) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.month));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
        WebElement month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));

        Select randommonth = new Select(month);
        randommonth.selectByIndex(index);
        return this;
    }

    //**********************************************************************************
    //TODO: year of Birth locator and method

    private final By year = By.xpath("//select[@name='DateOfBirthYear']");

    public P02_Registration selectyearofbirth(int index) {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(this.year));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
        WebElement year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        Select ranodmyear = new Select(year);
        ranodmyear.selectByIndex(index);
        return this;
    }

    //**********************************************************************************
    //TODO: Email locator and method
    private final By email = By.id("Email");

    public P02_Registration fillemail(String email) {
        driver.findElement(this.email).sendKeys(email);
        return this;
    }

    //**********************************************************************************
    //TODO: Company name locator and method
    private final By companyname = By.id("Company");

    public P02_Registration fillcompanyname(String companyname) {
        driver.findElement(this.companyname).sendKeys(companyname);
        return this;
    }


    //**********************************************************************************
    //TODO: Password locator and method
    private final By password = By.id("Password");

    public P02_Registration fillpassword(String password) {
        driver.findElement(this.password).sendKeys(password);
        return this;
    }

    //**********************************************************************************
    //TODO: Confirm Password locator and method
    private final By confirmpassword = By.id("ConfirmPassword");

    public P02_Registration fillconfirmpassword(String confirmpassword) {

        driver.findElement(this.confirmpassword).sendKeys(confirmpassword);
        return this;
    }

    //**********************************************************************************
    //TODO: Registration button locator and method

    private final By registerbutton = By.id("register-button");

    public P02_Registration clickonregisterbutton() {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(this.registerbutton));
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
        driver.findElement(this.registerbutton).click();
        return this;
    }

    //**********************************************************************************//


private final By registrationmsg=By.xpath("//div[@class=\"result\"]");

    public Boolean validateregistrationmsg(){
        return driver.findElement(this.registrationmsg).isDisplayed();
    }

    private final By passerror=By.id("ConfirmPassword-error");

    public Boolean validatewrongpassmsg(){
        return driver.findElement(this.passerror).isDisplayed();
    }

}
