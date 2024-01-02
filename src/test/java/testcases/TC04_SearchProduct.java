package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P04_HomePageWithLogin;

import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;
import static utilities.Utility.captureScreenshot;

//import static testcases.TC01_Registration.Email;

public class TC04_SearchProduct extends TestBase {


    @Test(priority = 1, description = "search for available product")
    public void searchavailableproduct_P() {
        String searchword = "Apple";

        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        new P04_HomePageWithLogin(driver).searchproductfunctionality(searchword);
        new P04_HomePageWithLogin(driver).clickonsearchbutton();
        new P04_HomePageWithLogin(driver).scrollDown();
        captureScreenshot(driver, "P-Search Product");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(new P04_HomePageWithLogin(driver).checkifadvancedsearchdisplayed());
        softAssert.assertAll();



    }
}
