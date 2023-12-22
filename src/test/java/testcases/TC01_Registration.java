package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_Registration;
import org.testng.asserts.SoftAssert;
import utilities.Utility;

import static utilities.Utility.*;

public class TC01_Registration extends TestBase {


    static String email;
    static String password;

    @Test(priority = 1, description = "Register New User With Valid Data")
    public void registerNewUserWithValidData_P() throws InterruptedException {

        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();
        int randomday = generaterandom(28);
        int randommonth = generaterandom(12);
        int randomyear = generaterandom(20);
        email = faker.internet().emailAddress();
        String companyname = "Software";
        String password = "1234ab";
        String confirmpassword = "1234ab";

        new P01_HomePage(driver).clickonregistrationtap();
        //Thread.sleep(1500);
        new P02_Registration(driver).choosegender().fillfirstname(firstname).filllastname(lastname);
        Thread.sleep(800);
        new P02_Registration(driver).selectdayofbirth(randomday).selectmonth(randommonth).selectyearofbirth(randomyear).fillemail(email).fillcompanyname(companyname).fillpassword(password).fillconfirmpassword(confirmpassword);
        Thread.sleep(800);
        new P02_Registration(driver).clickonregisterbutton();
        Thread.sleep(1000);
        // TODO: capture screenshot
      captureScreenshot(driver,"P_Registration");


    }

    @Test(priority = 2, description = "check registration with not matching confirmation password")
    public void checkregwithnotmatchingpassword_N() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();
        int randomday = generaterandom(28);
        int randommonth = generaterandom(12);
        int randomyear = generaterandom(20);
        String companyname = "Software";
        String password = "1234ab";
        String confirmpassword = "123aaa";
        email = faker.internet().emailAddress();
        new P01_HomePage(driver).clickonregistrationtap();
        Thread.sleep(1000);
        new P02_Registration(driver).choosegender().fillfirstname(firstname).filllastname(lastname).selectdayofbirth(randomday).selectmonth(randommonth).selectyearofbirth(randomyear).fillemail(email).fillcompanyname(companyname).fillpassword(password).fillconfirmpassword(confirmpassword).clickonregisterbutton();
        Thread.sleep(2500);


    }


}
