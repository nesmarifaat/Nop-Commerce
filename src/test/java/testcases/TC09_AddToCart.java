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

//import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;
import static utilities.Utility.captureScreenshot;
import static utilities.Utility.generaterandom;

public class TC09_AddToCart extends TestBase {

@Description("Select all products details and add it to cart")
@Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1, description = "Click On Select Size Menu and choose size then add to cart")
    public void addproducttocart_P()  {

        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        new P04_HomePageWithLogin(driver).clickondigitaldownloads();
        new P05_Products(driver).scrollDown().clickonnightvision().scrollDown();
        new P05_Products(driver).addproducttocart();
        captureScreenshot(driver, "Add Product to cart");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P05_Products(driver).ifsucessmsgdisplayed());
        softAssert.assertAll();



    }
}
