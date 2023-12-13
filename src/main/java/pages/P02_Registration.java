package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;





import static utilities.Utility.*;

public class P02_Registration {
    //1- Define Webdriver
    WebDriver driver;


    //2- Define Constractor

    public P02_Registration(WebDriver driver)
    {
        this.driver=driver;
    }


    //TODO: Gender Locator and method
    private final By gender=By.id("gender-male");

    public P02_Registration choosegender()
    {
        driver.findElement(this.gender).click();
        return this;
    }

    //**********************************************************************************//
     //TODO: Firstname locator and method
    private final By firstname=By.id("FirstName");

    public P02_Registration fillfirstname(String firstname)
    {
        driver.findElement(this.firstname).sendKeys(firstname);
        return this;
    }

    //**********************************************************************************//
    //TODO: Lastname locator and method
    private final By lastname=By.id("LastName");

    public P02_Registration filllastname(String lastname)
    {
        driver.findElement(this.lastname).sendKeys(lastname);
        return this;
    }

    //**********************************************************************************//
    //TODO: Day of Birth locator and method
    private final By  dayofbirth= By.xpath("//select[@name='DateOfBirthDay']");

    public P02_Registration selectdayofbirth(int index)
    {
        WebElement dayofbirth= (WebElement) driver.findElement(this.dayofbirth);
        //WebElement dayofbirth=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));

        Select randomday=new Select(dayofbirth);
         randomday.selectByIndex(index);
         return this;
    }

    //**********************************************************************************
    //TODO: Month of Birth locator and method
    private final By month=By.xpath("//select[@name='DateOfBirthMonth']");

    public P02_Registration selectmonth(int index)
    {
        WebElement month=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));

        Select randommonth=new Select(month);
        randommonth.selectByIndex(index);
        return this;
    }

    //**********************************************************************************
    //TODO: year of Birth locator and method

    private final By year=By.xpath("//select[@name='DateOfBirthYear']");

    public P02_Registration selectyearofbirth(int index)
    {
        WebElement year=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        Select ranodmyear=new Select(year);
        ranodmyear.selectByIndex(index);
        return this;
    }

    //**********************************************************************************
    //TODO: Email locator and method
    private final By email=By.id("Email");
    public P02_Registration fillemail(String email)
    {
        driver.findElement(this.email).sendKeys(email);
        return this;
    }

    //**********************************************************************************
    //TODO: Company name locator and method
    private final By companyname=By.id("Company");

    public P02_Registration fillcompanyname(String companyname)
    {
        driver.findElement(this.companyname).sendKeys(companyname);
        return this;
    }


    //**********************************************************************************
    //TODO: Password locator and method
    private final By password=By.id("Password");
    public P02_Registration fillpassword(String password)
    {
        driver.findElement(this.password).sendKeys(password);
        return this;
    }

    //**********************************************************************************
    //TODO: Confirm Password locator and method
    private final By confirmpassword=By.id("ConfirmPassword");
    public P02_Registration fillconfirmpassword(String confirmpassword)
    {
        driver.findElement(this.confirmpassword).sendKeys(confirmpassword);
        return this;
    }

    //**********************************************************************************
    //TODO: Registration button locator and method

    private final By registerbutton=By.id("register-button");
    public P02_Registration clickonregisterbutton()
    {
        driver.findElement(this.registerbutton).click();
        return this;
    }

    //**********************************************************************************//
    //TODO: not matching password msg locator and methods
    private final By confirmpassworderror=By.id("ConfirmPassword-error");
  public P02_Registration  checkconfirmpassworderror()
    {

        String error=driver.findElement(this.confirmpassworderror).getText();
return this;

    }






















//    WebDriver driver;
//    //TODO: 1- define constructor include page factory
//    public P02_Registration(WebDriver driver){
//        this.driver= driver;
//        PageFactory.initElements(driver,this);
//    }
//    //TODO: 2- define locators
//    @FindBy(id = "//input[@type='radio']")
//    WebElement gender;
//
//    public void chooseGender()
//    {
//        //this.gender.click();
//        driver.findElement(By.id("gender-female")).click();
//    }
//
//    @FindBy(id = "FirstName")
//    WebElement firstName;
//
//    public void addFirstname(String firstName)
//    {
//        this.firstName.sendKeys(firstName);
//    }
//
//    @FindBy(id = "LastName")
//    WebElement lastname;
//
//    public void fillLastname(String lastname)
//    {
//        this.lastname.sendKeys(getRandomLastName());
//    }
//
//    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
//    WebElement day;
//
//   public void selectDay(int index)
//   {
//       Select randomday=new Select(day);
//       randomday.selectByIndex(index);
//   }
//
//
//    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
//    WebElement month;
//
//   public void selectmonth(int index)
//   {
//       Select randommonth=new Select(month);
//       randommonth.selectByIndex(index);
//   }
//
//    @FindBy(xpath = "//input[@id='Email']")
//    WebElement email;
//
//    public void fillemail(String Email)
//    {
//        this.email.sendKeys(Email);
//    }
//
//    @FindBy(xpath = "//input[@id='Company']")
//    WebElement companyname;
//
//
//
//    public void companyname(String companyname)
//    {
//        this.companyname.sendKeys(companyname);
//    }
//
//    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
//    WebElement year;
//
//    public void selectyear(int index)
//    {
//        Select randomyear=new Select(year);
//        randomyear.selectByIndex(index);
//    }
//
//    @FindBy(id = "Password")
//    WebElement password;
//
//    public void fillpassword(String password){
//        this.password.sendKeys(password);
//    }
//
//    @FindBy(id = "ConfirmPassword")
//    WebElement confirmpassword;
//
//    public void confirmpassword(String confirmpassword)
//    {
//
//        this.confirmpassword.sendKeys(confirmpassword);
//    }
//
//    @FindBy(id = "register-button")
//    WebElement register;
//
//    public void registerbutton(){
//        this.register.click();
//    }



















}
