package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.util.List;
import java.util.Random;

import static org.openqa.selenium.Keys.*;

public class P05_Products {

    WebDriver driver;

    public P05_Products(WebDriver driver)
    {
        this.driver=driver;
    }

    //TODO:1- Color Filter Locator and random choose method
    private final By colorfilter=By.xpath("//li[@class='item color-item']");
    public P05_Products chooserandomfiltercolor()
    {
        List<WebElement> colorfilter=driver.findElements(this.colorfilter);
        Random random=new Random();
        int randomcolor=random.nextInt(colorfilter.size());
        WebElement randomLink = colorfilter.get(randomcolor);
        colorfilter.get(randomcolor).click();
        return this;
    }

    //*********************************************************************************
    //TODO:Select Random Product of Jewelry Category

    private final By jewelryproduct=By.xpath("/html[1]/body[1]/div/div/div/div/div/div/div/div/div/div/div/div/div/a/img");
    public P05_Products selectrandomjeweleyproduct()
    {
      List<WebElement> jewelryproduct=driver.findElements(this.jewelryproduct);
        Random random = new Random();
        int randomjewelryproduct=random.nextInt(jewelryproduct.size());
        WebElement randomLink = jewelryproduct.get(randomjewelryproduct);
        jewelryproduct.get(randomjewelryproduct).click();
        return this;
    }


    //*********************************************************************************
//TODO: nightvision product locator and method
    private final By nightvision=By.xpath("//div[@class='product-item']//img[@title='Show details for Night Visions']");
    public P05_Products clickonnightvision()
    {
        driver.findElement(this.nightvision).click();
        return this;
    }

    //*********************************************************************************
    //TODO: add nightvision to cart locator and methods
    private final By addtocart=By.id("add-to-cart-button-34");
    public P05_Products addproducttocart()  {

        driver.findElement(this.addtocart).click();
        return this;
    }
    //*********************************************************************************
    //TODO:Nokia Lumia locator and method
    private final By NokiaLumia=By.xpath("//div[@class='picture']//img[@title='Show details for Nokia Lumia 1020']");
    public P05_Products clickonnokialumia()
    {
        driver.findElement(this.NokiaLumia).click();
        return this;
    }
    //*********************************************************************************
    //TODO: Add Nokia Lumia to compare list locator and methods
    private final By addtocomaprelist=By.xpath("//div[@class='compare-products']//button[@type='button'][normalize-space()='Add to compare list']");
    public P05_Products addproducttocomparelist()
    {
        driver.findElement(this.addtocomaprelist).click();
      return this;
    }


    //*********************************************************************************
    //TODO: fill gift card fields locators and methods

    private final By card2=By.xpath("//div[@class='picture']//img[@title='Show details for $50 Physical Gift Card']");
    public P05_Products clickoncard2()
    {
        driver.findElement(this.card2).click();
        return this;
    }

    private final By cardfields=By.xpath("//input[@class='recipient-name']");
    public P05_Products fillgiftcardfields(String info)
    {
        WebElement cardfields=driver.findElement(this.cardfields);
        driver.findElement(this.cardfields).sendKeys(info);
        cardfields.sendKeys(TAB);
        cardfields.sendKeys(TAB);
        return this;
    }

    //*********************************************************************************

    //TODO: Add product to wishlist locator and method
    private final By addtowishlist=By.xpath("//button[@id='add-to-wishlist-button-44']");
    public final P05_Products addproducttowishlist()
    {
        driver.findElement(this.addtowishlist).click();
        return this;
    }

    //TODO: click on shipping cart
    private final By shippingcart=By.xpath("//span[@class='cart-qty']");
    public P05_Products clickonshippingcart()  {

        driver.findElement(this.shippingcart).click();
        return this;
    }
    //TODO:Scroll Down

    public P05_Products scrollDown()  {

        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)");
        return this;

    }





//    WebDriver driver;
//
//    public P05_Products(WebDriver driver)
//    {
//        this.driver=driver;
//        PageFactory.initElements(driver,this);
//    }
//
//    //TODO: Shoes Color Filter Locator and Method
//
//    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Shoes']")
//    WebElement shoessubcategory;
//
//    public void clickonshoessubcategory()
//    {
//        this.shoessubcategory.click();
//    }
//
//    @FindBy(xpath = "/html[1]/body[1]/div/div/div/div/div/div/div/ul/li/input")
//   List <WebElement> shoescolor;
//
//    public void chooseshoescolor()
//    {
//        Random random = new Random();
//        int randomproduct=random.nextInt(shoescolor.size());
//        //WebElement randomLink=driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/div/a"));
//        WebElement randomLink = shoescolor.get(randomproduct);
//        shoescolor.get(randomproduct).click();
//    }
//
//    //TODO:Select Random Product of Jewelry Category
//
//    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
//    WebElement JewelryCategory;
//
//    public void clickonjewelry()
//    {
//        this.JewelryCategory.click();
//    }
//
//    @FindBy(xpath = "/html[1]/body[1]/div/div/div/div/div/div/div/div/div/div/div/div/div/a/img")
//    List<WebElement> jewelryproduct;
//
//    public void selectrandomjewelryproduct()
//    {
//        Random random = new Random();
//        int randomproduct=random.nextInt(jewelryproduct.size());
//       // WebElement randomLink=driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/div/a"));
//        WebElement randomLink = jewelryproduct.get(randomproduct);
//        jewelryproduct.get(randomproduct).click();
//    }
//
//    //TODO:Add Product To Cart LOcator and Method
//    @FindBy(xpath = "//div[@class='product-item']//img[@title='Show details for Night Visions']")
//    WebElement NightVisionImage;
//
//    public void clickonnightvisionimage()
//    {
//        this.NightVisionImage.click();
//    }
//
//    @FindBy(id = "add-to-cart-button-34")
//
//    WebElement Addtocartbutton;
//
//    public void clickonaddtocartbutton()
//    {
//        this.Addtocartbutton.click();
//    }
//
//    //TODO:Product To Comparelist Locator and Method
//   @FindBy(xpath = "//div[@class='compare-products']//button[@type='button'][normalize-space()='Add to compare list']")
//    WebElement Addtocomparelist;
//
//    public void addproducttocomparelist()
//    {
//        this.Addtocomparelist.click();
//    }
//
//    //TODO:Add To Wish List Locator and Method
//
//    @FindBy(id = "add-to-wishlist-button-34")
//    WebElement Addtowishlist;
//
//    public void Addproducttowishlist()
//    {
//        this.Addtowishlist.click();
//    }
//
//    //TODO:Click on Shipping cart locator and method
//
//    @FindBy(xpath = "//span[@class='cart-qty']")
//    WebElement Shippingcart;
//
//    public void clickonshippingcart()
//    {
//        this.Shippingcart.click();
//    }
//
//
//    public void scrollDown()
//
//    {
//
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,480)");
//
//    }



}
