package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class P04_HomePageWithLogin {
    WebDriver driver;

    public P04_HomePageWithLogin(WebDriver driver)
    {
       this.driver=driver;
    }
     //TODO:Write in Search Field locator and method
    private final By search=By.xpath("//input[@type='text']");

    public P04_HomePageWithLogin searchproductfunctionality(String searchword)
    {
        driver.findElement(this.search).sendKeys(searchword);
        return this;
    }

    //*********************************************************************************
    //TODO: Search button locator and method
    private final By searchbutton=By.xpath("//button[@class='button-1 search-box-button']");

    public P04_HomePageWithLogin clickonsearchbutton(){
        driver.findElement(this.searchbutton).click();
        return this;
    }


    //************************************************************************************
    //TODO: Currency drop down list locator and method

    private final By customercurrency=By.xpath("//select[@id='customerCurrency']");
    public P04_HomePageWithLogin opencurrencymenu()
    {
        driver.findElement(this.customercurrency).click();
        return this;
    }

    //************************************************************************************
    //TODO: Switch Currency locator and method

    private final By switchcurrency=By.xpath("//option[text()='Euro']");
    public P04_HomePageWithLogin switchcurrentcurrency()

    {
        driver.findElement(this.switchcurrency).click();
        return this;
    }

    //************************************************************************************
    //TODO:Select Random Category Locator and Method
    private final By allcategories=By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li/a");
    public P04_HomePageWithLogin chooserandomcategory()
    {

       List<WebElement> allcategories=driver.findElements(this.allcategories);

       Random random = new Random();
        int randomcategory=random.nextInt(allcategories.size());
       // WebElement randomLink=driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li/a"));
        WebElement randomLink = allcategories.get(randomcategory);
        allcategories.get(randomcategory).click();

        return this;
    }

    //************************************************************************************
    //TODO:1- Move to Apparel Locator and Method
    private final By apparel=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");

    public P04_HomePageWithLogin movetoapparelcategory()  {
        Actions action=new Actions(driver);
        WebElement apparel=driver.findElement(this.apparel);
       // action.moveToElement((WebElement) this.apparel).build().perform();
     action.moveToElement(apparel).build().perform();

     return this;
    }

    //************************************************************************************
    //TODO:1- Move to Shoes subctegory of apparel Locator and Method

    private final By shoes=By.xpath("//ul[@class='sublist first-level']//a[@href='/shoes']");
    public P04_HomePageWithLogin clickonshoessubcategory() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(this.shoes).click();
        return this;
    }


    //************************************************************************************
    //TODO:1- Click on Jewelry category
    private final By jewelry=By.xpath("//a[@href='/jewelry']");
    public P04_HomePageWithLogin selectjewelrycategory()
    {
        driver.findElement(this.jewelry).click();
        return this;
    }

    //************************************************************************************
    //TODO: click on Digital downloads category locator and methods
    private final By digitaldownloads=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
    public P04_HomePageWithLogin clickondigitaldownloads()
    {
        driver.findElement(this.digitaldownloads).click();
        return this;
    }

    //************************************************************************************
    //TODO: move to Electronics category locattor and method
    private final By electronics=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    public P04_HomePageWithLogin movetoelectronics() {

        Actions action=new Actions(driver);
        WebElement electronics=driver.findElement(this.electronics);
        action.moveToElement(electronics).build().perform();
        return this;
    }

    //************************************************************************************
    //TODO: Electronics sub category locator and method
    private final By cellphones=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    public P04_HomePageWithLogin clickoncellphone() {

        driver.findElement(this.cellphones).click();
        return this;
    }


    //************************************************************************************
    //TODO: Click on gift cards locator and methods
    private final By giftcards=By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']");
    public P04_HomePageWithLogin clickongiftcards()
    {
        driver.findElement(this.giftcards).click();
        return this;
    }



//************************************************************************************
    //TODO:Scroll Down

    public P04_HomePageWithLogin scrollDown()

    {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)");
        return this;

    }


//    WebDriver driver;
//
//    public P04_HomePageWithLogin(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//
//    }
////TODO:Search function locator and methods
//@FindBy(xpath = "//input[@type='text']")
//WebElement searchfeild;
//public void fillsearchfeild(String Searchbyword)
//{
//    this.searchfeild.sendKeys(Searchbyword);
//}
//
//    @FindBy(xpath = "//button[@class='button-1 search-box-button']")
//    WebElement searchbutton;
//
//    public void clicksearchbutton()
//    {
//        this.searchbutton.click();
//    }
//
//
//    //TODO:Switch Currency locator and method
//
//    @FindBy(xpath = "//option[2]")
//    WebElement currency;
//
//    public void changecurrency()
//    {
//        this.currency.click();
//    }
//
//
//    //TODO:Select Random Category Locator and Method
//    @FindBy(xpath = "/html[1]/body[1]/div[6]/div[2]/ul[1]/li/a")
//    List<WebElement> Allcategories;
//
//
//    public void chooserandomcategory()
//    {
//
//        Random random = new Random();
//        int randomnumber=random.nextInt(Allcategories.size());
//        //WebElement randomLink=driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li/a"));
//        WebElement randomLink = Allcategories.get(randomnumber);
//        Allcategories.get(randomnumber).click();
//
//    }
//
//    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
//    WebElement Apparel;
//
//    public void clickonapparel()
//    {
//        new Actions(driver).moveToElement(Apparel).perform();
//    }
//
//
//    @FindBy(xpath = "/html[1]/body[1]/div/div/ul[1]/li[3]/ul[1]/li/a")
//   List <WebElement> Apparelsubcategory;
//
//    public void clickonapparelsubcategory()
//    {
//        Random random = new Random();
//        int randomproduct=random.nextInt(Apparelsubcategory.size());
//        //WebElement randomLink=driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/div/a"));
//       WebElement randomLink = Apparelsubcategory.get(randomproduct);
//        Apparelsubcategory.get(randomproduct).click();
//    }
//
//    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
//    WebElement mousehoverapparel;
//
//    public void hoveronapparel()
//    {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(mousehoverapparel).build().perform();
//    }
//
//    //TODO:Digital Downloads Locator and Method
//
//    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")
//    WebElement Digitaldownloads;
//
//    public void clickondigitaldownloads()
//    {
//        this.Digitaldownloads.click();
//    }
//
//
//    //TODO:Scroll Down
//
//    public void scrollDown()
//
//    {
//
//
//        //driver.navigate().to("https://demo.nopcommerce.com"); // Specify the Website URL
//
//        //to perform scroll on an application using Selenium
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,480)");
//
//    }


}