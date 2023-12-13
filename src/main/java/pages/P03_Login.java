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
    public  P03_Login(WebDriver driver)
    {
        this.driver=driver;
    }
    //**********************************************************************************//



    //3-Define Locators
    private final By email=By.xpath("//input[@class='email']");



    //TODO: fill email locator and method
    public P03_Login fillemail(String email)
    {
        driver.findElement(this.email).sendKeys(email);
        return this;
    }
    //**********************************************************************************//
   //TODO: fill password locator and method

    private final By password=By.xpath("//input[@class='password']");
    public P03_Login fillpassword(String password)
    {
        driver.findElement(this.password).sendKeys(password);
        return this;
    }
    //**********************************************************************************
    //TODO: login button locator and method
    private final By loginbutton=By.xpath("//button[@class='button-1 login-button']");
    public P03_Login clickloginbutton()
    {
        driver.findElement(this.loginbutton).click();
        return this;
    }

    //**********************************************************************************
    //TODO: Reset password locator and method
    private final By resetpassword=By.xpath("//a[@href='/passwordrecovery']");
    public P03_Login clickonforgetpassword()
    {
        driver.findElement(this.resetpassword).click();
        return this;
    }
    //**********************************************************************************
    //TODO: fill email to reset password locator and method

    private final By resetpasswordemail=By.xpath("//input[@class='email']");
    public P03_Login fillemailtoresetpassword(String email)
    {
        driver.findElement(this.resetpasswordemail).sendKeys(email);
        return this;
    }

    //**********************************************************************************
    //TODO: Recover button locator and method
    private final By recoverbutton=By.xpath("//button[@name='send-email']");
    public P03_Login clickonrecoverbutton()
    {
        driver.findElement(this.recoverbutton).click();
        return this;
    }







//WebDriver driver;
//
//
//    public P03_Login(WebDriver driver){
//        this.driver= driver;
//        PageFactory.initElements(driver,this);
//
//    }
//
//    @FindBy(xpath = "//input[@class='email']")
//    WebElement Email;
//
//    public void sendemail(String Email)
//    {
//
//        this.Email.sendKeys(Email);
//    }
//
//    @FindBy(xpath = "//input[@class='password']")
//    WebElement password;
//
//    public void enterpassword(String password)
//    {
//        this.password.sendKeys(password);
//    }
//
//    @FindBy(xpath = "//input[@type='checkbox']")
//    WebElement rememberme;
//
//    public void remembermecheckbox()
//    {
//        this.rememberme.click();
//    }
//
//    @FindBy(xpath = "//button[@class='button-1 login-button']")
//
//    WebElement loginbutton;
//
//    public void clickloginbutton()
//    {
//        this.loginbutton.click();
//    }
//
////TODO: Reset Password Locator and method
//    @FindBy(xpath = "//a[@href='/passwordrecovery']")
//    WebElement forgetpassword;
//    public void resetpassword()
//    {
//        this.forgetpassword.click();
//    }
//
//    @FindBy(xpath = "//input[@class='email']")
//    WebElement resetpassbyemail;
//
//    public void emailtoresetpassword(String Email)
//    {
//        this.resetpassbyemail.sendKeys(Email);
//    }
//
//    @FindBy(xpath = "//button[@name='send-email']")
//    WebElement recoverbutton;
//
//    public void clickrecoverbutton()
//    {
//        this.recoverbutton.click();
//    }
//
//
//
//
//
//
//
//
//
//
////@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div/dl[1]/dd[1]/select[1]")
////    WebElement shoessize;
////
//// public void clickonselectsize(int index)
//// {
////     try {
////         Select randomday=new Select(shoessize);
////         randomday.selectByIndex(index);
////        // addtocart.click();
////     }
////     catch (NoSuchElementException e)
////     {
////         //addtocart.click();
////         driver.findElement(By.xpath("//button[text()='Add to cart']"));
////         //this.shoppingcart.click();
////         //this.termsofservice.click();
////        // this.checkoutbutton.click();
////     }
////
////
//// }
//
// @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[6]/dl[1]/dd[2]/select")
//WebElement choosecolormenu;
//
// public void choosecolorfrommenu(int index)
// {
//     try {
//         Select random=new Select(choosecolormenu);
//         random.selectByIndex(index);
//
//        // this.addtocart.click();
//
//     }
//     catch (NoSuchElementException e)
//     {
//
//        // this.addtocart.click();
//        // this.shoppingcart.click();
//        // this.termsofservice.click();
//        // this.checkoutbutton.click();
//     }
////     if (choosecolormenu==null || shoessize==null || randomshoescolor==null)
////     {
////         driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
////         this.shoppingcart.click();
////         this.termsofservice.click();
////         this.checkoutbutton.click();
////     }
//
// }
//
//// @FindBy(xpath = "/html[1]/body/div/div/div/div/div/div/form/div/div/div/div/dl/dd/ul/li/label/span/span")
////  List<WebElement> randomshoescolor;
////
//// public void selectrandomshoescolor()
//// {
////     try {
////
////         Random random = new Random();
////         int randomcolor=random.nextInt(randomshoescolor.size());
////         //WebElement randomLink=driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/div/a"));
////         WebElement randomLink = randomshoescolor.get(randomcolor);
////         randomshoescolor.get(randomcolor).click();
////         //addtocart.click();
////     }
////     catch (NoSuchElementException e)
////     {
////         //addtocart.click();
///////this.shoppingcart.click();
////
////     }
////
////     if (randomshoescolor ==null)
////     {
////         driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
////        // this.shoppingcart.click();
////        // this.termsofservice.click();
////         //this.checkoutbutton.click();
////     }
////
//// }
//
//
//
//
//
//
//
//// public void handelwindows(int index, String cityname,String Firstaddress, String postalcode,String phonenumber )
//// {
////
////     String currentwindow= driver.getWindowHandle();
////     //Check we don't have other windows open already
////     assert driver.getWindowHandles().size() == 1;
////     //Click the link which opens in a new window
////     driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")).click();
////     for (String windowHandle : driver.getWindowHandles())
////     {
////
////         if(currentwindow.contentEquals(windowHandle))
////         {
////
//////             Select random=new Select(choosecountry);
//////             random.selectByIndex(index);
//////             this.cityname.sendKeys(cityname);
//////             this.Firstaddress.sendKeys(Firstaddress);
//////             this.postalcode.sendKeys(postalcode);
//////             random=new Select(choosecountry);
//////             random.selectByIndex(16);
//////             this.phonenumber.sendKeys(phonenumber);
//////             this.continuebutton.click();
////
////         }
////         else {
////             this.contbutton.click();
////
////
////         }
////
////     }
//
//
//
// @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
// WebElement contbutton;
//
// public void clickoncontbutton()
// {
//
//     this.contbutton.click();
// }
//
//



 }








