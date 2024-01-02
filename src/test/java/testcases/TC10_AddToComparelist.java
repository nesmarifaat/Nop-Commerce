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

//import static testcases.TC01_Registration.Email;

public class TC10_AddToComparelist extends TestBase {
    @Description("Check Functionality of Add Product to compare list")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 1, description = "Add Product To Compare list")
    public void addproducttocomparelist_P() {

        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        new P04_HomePageWithLogin(driver).movetoelectronics().clickoncellphone();
        new P05_Products(driver).scrollDown().clickonnokialumia();
        new P05_Products(driver).scrollDown().addproducttocomparelist();
        captureScreenshot(driver, "Add Product to Compare list");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P05_Products(driver).ifprodcomparisonmsgdisplayes());
        softAssert.assertAll();


    }
}
