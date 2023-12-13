package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P08_PaymentMethod {

    WebDriver driver;

    public P08_PaymentMethod(WebDriver driver)
    {
        this.driver=driver;

    }

    private final By paymentmethod=By.id("paymentmethod_1");
    public P08_PaymentMethod choosepaymentmethod()
    {
        driver.findElement(this.paymentmethod).click();
        return this;
    }

    private final By continuebutton=By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    public P08_PaymentMethod clickoncontinuebutton()
    {
        driver.findElement(this.continuebutton).click();
        return this;
    }
//    WebDriver driver;
//
//
//    public P08_PaymentMethod(WebDriver driver)
//    {
//        this.driver=driver;
//        PageFactory.initElements(driver,this);
//    }
//
//    //TODO:Select Payment Method Locator and Method
//    @FindBy(id = "paymentmethod_1")
//    WebElement creditcard;
//
//    public void choosecreditcard()
//    {
//        this.creditcard.click();
//    }
//
//    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
//    WebElement continuebutton;
//
//    public void clickoncontinurebutton()
//    {
//        this.continuebutton.click();
//    }

}
