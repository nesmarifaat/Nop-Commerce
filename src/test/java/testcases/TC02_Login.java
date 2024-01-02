package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P02_Registration;
import pages.P03_Login;
import pages.P04_HomePageWithLogin;

import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;
import static utilities.Utility.captureScreenshot;


public class TC02_Login extends TestBase {

    @Description("Check Login Functionality with valid username and password")
    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 1, description = "login with valid data ")
    public void loginwithvaliddata_P() throws InterruptedException {

        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        captureScreenshot(driver, "P-Login with invalid password");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P04_HomePageWithLogin(driver).validatelogotisdisplayed());
        softAssert.assertAll();
        ;

    }

    @Description("Checl login Functionality with valid username and invalid password")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2, description = "Check Login with valid email and invalid Password")
    public void loginwithinvalidpassword_N() throws InterruptedException {
        String password = "123aaa";
        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        captureScreenshot(driver, "N-Login with invalid password");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P03_Login(driver).validateununsuccessfullogin());
        softAssert.assertAll();

    }

    @Description("Checl login Functionality with valid password and invalid username")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3, description = "Check login with invalid email and valid password")
    public void loginwithvalidpasswordandinvalidemail_N() throws InterruptedException {
        String password = "1234ab";
        String email = "nesma.R@hotmail.com";
        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        captureScreenshot(driver, "N-Login with invalid username");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P03_Login(driver).validateununsuccessfullogin());
        softAssert.assertAll();
    }

    @Description("Checl login Functionality with invalid password and invalid username")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4, description = "Check login with invalid email and password")
    public void loginwithinvalidmailandpassword_N() throws InterruptedException {
        String password = "1234289";
        String email = "nesma.R@hotmail.com";
        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        captureScreenshot(driver, "N-Login with invalid username & Passwrod");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P03_Login(driver).validateununsuccessfullogin());
        softAssert.assertAll();
    }
}
