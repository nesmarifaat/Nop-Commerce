package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P03_Login;

import static testcases.TC01_Registration.email;
import static utilities.Utility.captureScreenshot;

//import static testcases.TC01_Registration.Email;

public class TC03_ResetPassword extends TestBase {


    @Test(priority = 1, description = "Reset Customer Password")
    public void resetcustomerpassword_P()  {
        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).clickonforgetpassword().fillemailtoresetpassword(email).clickonrecoverbutton();
        captureScreenshot(driver, "P-Reset Password");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(new P03_Login(driver).validaterestpassmsg());
        softAssert.assertAll();


    }

    @Test(priority = 2, description = "Check Reset password with invalid email")
    public void resetpasswordwithinvalidemail_N() {
        String email = "nesmarifaat@hotmail.com";
        new P01_HomePage(driver).clickonlogintap();

        new P03_Login(driver).clickonforgetpassword().fillemailtoresetpassword(email);

        new P03_Login(driver).clickonrecoverbutton();
        captureScreenshot(driver, "N- Reset Password");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(new P03_Login(driver).validatewrongemailmsg());
        softAssert.assertAll();
    }
}
