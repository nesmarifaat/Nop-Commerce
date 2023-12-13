package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P06_ShippingCart {

    WebDriver driver;
    public P06_ShippingCart(WebDriver driver)
    {
        this.driver=driver;
    }
    //********************************************************************************
    //TODO: Terms Of Service Locator and Method
    private final By termsofservice= By.id("termsofservice");
    public P06_ShippingCart checktermsofservice()
    {
        driver.findElement(this.termsofservice).click();
        return this;
    }

    //********************************************************************************
    //TODO: checkout button Locator and Method
    private final By checkout=By.id("checkout");
    public P06_ShippingCart clickoncheckout()
    {
        driver.findElement(this.checkout).click();
        return this;
    }




    public P06_ShippingCart scrollDown()  {


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)");
        return this;

    }

//    WebDriver driver;
//
//    public  P06_ShippingCart(WebDriver driver){
//        this.driver=driver;
//        PageFactory.initElements(driver,this);
//    }
//    //TODO: Terms Of Service Locator and Method
//
//    @FindBy(id = "termsofservice")
//    WebElement termsofservice;
//    public void clickonagreetermsofservice()
//    {
//        this.termsofservice.click();
//    }
//
//    //TODO: checkout button Locator and Method
//
//    @FindBy(id = "checkout")
//    WebElement checkoutbutton;
//
//    public void clickoncheckoutbutton()
//    {
//        this.checkoutbutton.click();
//
//    }
}
