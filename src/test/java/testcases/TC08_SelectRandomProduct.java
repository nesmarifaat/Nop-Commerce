package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P04_HomePageWithLogin;
import pages.P05_Products;

import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;
import static utilities.Utility.captureScreenshot;


public class TC08_SelectRandomProduct extends TestBase {

    @Description("Select Random Product")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 1, description = "Add product to shopping cart")

    public void addproducttoshoppingcart_P() {

        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        new P04_HomePageWithLogin(driver).selectjewelrycategory();
        new P05_Products(driver).selectrandomjeweleyproduct();
        new P05_Products(driver).scrollDown();
        captureScreenshot(driver, "Select Random Product");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P05_Products(driver).ifaddtocomparelistvisible());
        softAssert.assertAll();


    }
}
