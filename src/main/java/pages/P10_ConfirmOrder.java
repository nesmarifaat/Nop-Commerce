package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P10_ConfirmOrder {

    WebDriver driver;

    public P10_ConfirmOrder(WebDriver driver)
    {
        this.driver=driver;
    }

//**********************************************************************************************
    //TODO:Confirm Order LOcator and Method
    private final By confirmbutton=By.xpath("//button[normalize-space()='Confirm']");
    public P10_ConfirmOrder clickonconfirmbutton()
    {
        driver.findElement(this.confirmbutton).click();
        return this;
    }
//    WebDriver driver;
//
//    public P10_ConfirmOrder(WebDriver driver)
//    {
//        this.driver=driver;
//        PageFactory.initElements(driver,this);
//    }
//
//    //TODO:Confirm Order LOcator and Method
//
//    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
//    WebElement confirmorderbutton;
//
//    public void clickonconfirmorderbutton()
//    {
//        this.confirmorderbutton.click();
//    }
}
