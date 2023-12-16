package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;

import static testcases.TC01_Registration.email;


public class TC02_Login extends TestBase {


    @Test(priority = 1, description = "login with valid data ")
    public void loginwithvaliddata_P() throws InterruptedException {
        String password = "1234ab";
        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();

        Thread.sleep(1500);


    }

    @Test(priority = 2, description = "Check Login with valid email and invalid Password")
    public void loginwithinvalidpassword_N() throws InterruptedException {
        String password = "123aaa";
        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        Thread.sleep(2000);

    }

    @Test(priority = 3, description = "Check login with invalid email and valid password")
    public void loginwithvalidpasswordandinvalidemail_N() throws InterruptedException {
        String password = "1234ab";
        String email = "nesma.R@hotmail.com";
        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        Thread.sleep(3000);
    }

    @Test(priority = 4, description = "Check login with invalid email and password")
    public void loginwithinvalidmailandpassword_N() throws InterruptedException {
        String password = "1234289";
        String email = "nesma.R@hotmail.com";
        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        Thread.sleep(3000);
    }
}
