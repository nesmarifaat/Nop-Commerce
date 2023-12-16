package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;

public class P07_BillingAddress {

    WebDriver driver;

    public P07_BillingAddress(WebDriver driver) {
        this.driver = driver;
    }

    //***********************************************************************************
    //TODO:Billing Address Locators and Methods
    private final By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");

    public P07_BillingAddress choosecountry(int index) {
        WebElement country = driver.findElement(this.country);
        Select random = new Select(country);
        random.selectByIndex(index);
        return this;
    }

    private final By state = By.xpath("//select[@data-trigger='state-select']");

    public P07_BillingAddress selectstate(int index) {
        WebElement state = driver.findElement(this.state);
        Select random = new Select(state);
        random.selectByIndex(index);
        return this;
    }

    private final By city = By.id("BillingNewAddress_City");

    public P07_BillingAddress choosecity(String city) {
        driver.findElement(this.city).sendKeys(city);
        return this;
    }

    private final By address = By.id("BillingNewAddress_Address1");

    public P07_BillingAddress filladdress(String address) {
        driver.findElement(this.address).sendKeys(address);
        return this;
    }

    private final By postalcode = By.id("BillingNewAddress_ZipPostalCode");

    public P07_BillingAddress fillpostalcode(String postalcode) {
        driver.findElement(this.postalcode).sendKeys(postalcode);
        return this;
    }

    private final By phonenumber = By.id("BillingNewAddress_PhoneNumber");

    public P07_BillingAddress fillphonenumber(String phonenumber) {
        driver.findElement(this.phonenumber).sendKeys(phonenumber);
        return this;
    }

    private final By continuebutton = By.xpath("//button[@class='button-1 new-address-next-step-button']");

    public P07_BillingAddress clickoncontinuebutton() {
        driver.findElement(this.continuebutton).click();
        return this;
    }


}
