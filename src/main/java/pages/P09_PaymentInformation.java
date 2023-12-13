package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P09_PaymentInformation {

    WebDriver driver;

    public P09_PaymentInformation(WebDriver driver)
    {
        this.driver=driver;
    }
    //*************************************************************************************
    //TODO:Payment Information Locators and Method
    private final By cardholdername=By.id("CardholderName");
    public P09_PaymentInformation fillcardholdername(String cardholdername)
    {
        driver.findElement(this.cardholdername).sendKeys(cardholdername);
        return this;
    }

    private final By cardnumber=By.id("CardNumber");
    public P09_PaymentInformation fillcardnumber(String cardnumber)
    {
        driver.findElement(this.cardnumber).sendKeys(cardnumber);
        return this;
    }

    //*************************************************************************************

    private final By expiremonth=By.id("ExpireMonth");
    public P09_PaymentInformation selectexpiremonth(int index)
    {
        WebElement expiremonth=driver.findElement(this.expiremonth);
        Select randommonth=new Select(expiremonth);
      randommonth.selectByIndex(index);
        return this;
    }

    //*************************************************************************************
    private final By expireyear=By.id("ExpireYear");
    public P09_PaymentInformation selectexpireyear(int index)
    {
        WebElement expireyear=driver.findElement(this.expireyear);
        Select randomyear=new Select(expireyear);
        randomyear.selectByIndex(index);
        return this;

    }

    private final By cardcode=By.id("CardCode");
    public P09_PaymentInformation fillcardcode(String cardcode)
    {
        driver.findElement(this.cardcode).sendKeys(cardcode);
        return this;
    }


    private final By submitpayment=By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    public P09_PaymentInformation clickonsubmitpayment()
    {
        driver.findElement(this.submitpayment).click();
        return this;
    }

    private final By continuebutton=By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    public P09_PaymentInformation clickoncontinuebutton(){
        driver.findElement(this.continuebutton).click();
        return this;
    }


//    WebDriver driver;
//
//    public P09_PaymentInformation(WebDriver driver)
//    {
//        this.driver=driver;
//        PageFactory.initElements(driver,this);
//    }
//
//    //TODO:Payment Information Locators and Method
//    @FindBy(id = "CardholderName")
//    WebElement Cardholdername;
//
//    public void fillcardholderfield(String Cardholdername)
//    {
//        this.Cardholdername.sendKeys(Cardholdername);
//    }
//
//    @FindBy(id = "CardNumber")
//    WebElement cardnumber;
//    public void fillcardnumber(String cardnumber)
//    {
//        this.cardnumber.sendKeys(cardnumber);
//    }
//
//    @FindBy(id = "ExpireMonth")
//    WebElement expirationmonth;
//
//    public void selectexpirationmonth(int index)
//    {
//        Select randommonth=new Select(expirationmonth);
//        randommonth.selectByIndex(index);
//    }
//
//    @FindBy(id = "ExpireYear")
//    WebElement expirationyear;
//
//    public void selectexpirationyear(int index)
//    {
//        Select randommonth=new Select(expirationyear);
//        randommonth.selectByIndex(3);
//    }
//
//    @FindBy(id = "CardCode")
//    WebElement cardcode;
//
//    public void fillcardcode(String cardcode )
//    {
//        this.cardcode.sendKeys(cardcode);
//    }
//
//    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
//    WebElement paymentinfosubmit;
//    public void submitpaymentinfo()
//    {
//        this.paymentinfosubmit.click();
//    }
//
//    @FindBy(xpath = "//button[@onclick='PaymentInfo.save()']")
//    WebElement continuebutton;
//
//    public void clickoncontinuebutton()
//    {
//        this.continuebutton.click();
//    }
}
