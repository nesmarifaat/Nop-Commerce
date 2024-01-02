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

public class TC11_AddToWishlist extends TestBase {
    @Description("Check Add product to wish list functionality")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 1, description = "Add Product to Wish List")

    public void addproducttowhishlist_P() throws InterruptedException {

        String info = "Nesma";
        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        new P04_HomePageWithLogin(driver).clickongiftcards();
        new P05_Products(driver).scrollDown().clickoncard2().scrollDown();
        new P05_Products(driver).fillgiftcardfields(info).addproducttowishlist();
        captureScreenshot(driver, "Add Product to Wish List");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P05_Products(driver).checkwishlistlink());
        softAssert.assertAll();


    }
}
