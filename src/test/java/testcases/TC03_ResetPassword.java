package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;

import static testcases.TC01_Registration.email;

//import static testcases.TC01_Registration.Email;

public class TC03_ResetPassword extends TestBase {


    @Test(priority = 1, description = "Reset Customer Password")
    public void resetcustomerpassword_P() throws InterruptedException {
        new P01_HomePage(driver).clickonlogintap();
        Thread.sleep(1500);
        new P03_Login(driver).clickonforgetpassword().fillemailtoresetpassword(email).clickonrecoverbutton();
        Thread.sleep(4000);

    }

    @Test(priority = 2, description = "Check Reset password with invalid email")
    public void resetpasswordwithinvalidemail_N() throws InterruptedException {
        String email = "nesmarifaat@hotmail.com";
        new P01_HomePage(driver).clickonlogintap();
        Thread.sleep(1500);
        new P03_Login(driver).clickonforgetpassword().fillemailtoresetpassword(email);
        Thread.sleep(800);
        new P03_Login(driver).clickonrecoverbutton();
        Thread.sleep(4000);
    }
}
