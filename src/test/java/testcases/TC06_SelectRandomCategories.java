package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P04_HomePageWithLogin;

import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;
import static utilities.Utility.captureScreenshot;
import static utilities.Utility.generaterandom;




public class TC06_SelectRandomCategories extends TestBase {


    @Test(priority = 1, description = "Select one Category Random")
    public void selectrandomcategory_P() throws InterruptedException {
        int randomcategory = generaterandom(7);
        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        new P04_HomePageWithLogin(driver).chooserandomcategory();
        captureScreenshot(driver, "Select random Category");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P04_HomePageWithLogin(driver).checkifcategoriesdisplayes());
        softAssert.assertAll();



    }
}
