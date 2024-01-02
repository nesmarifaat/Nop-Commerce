package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P04_HomePageWithLogin;

import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;
import static utilities.Utility.captureScreenshot;


public class TC05_SwitchCurrency extends TestBase {


    @Test(priority = 1, description = "Switch Currency to Euro")
    public void switchcurrency_P() throws InterruptedException {

        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        new P04_HomePageWithLogin(driver).opencurrencymenu();
        new P04_HomePageWithLogin(driver).switchcurrentcurrency();
        captureScreenshot(driver, "P-Change Currency");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P04_HomePageWithLogin(driver).checkcurrencychanges());
        softAssert.assertAll();

    }
}
