package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P04_HomePageWithLogin;

import static testcases.TC01_Registration.email;

//import static testcases.TC01_Registration.Email;

public class TC05_SwitchCurrency extends TestBase {


    @Test(priority = 1, description = "Switch Currency to Euro")
    public void switchcurrency_P() throws InterruptedException {
        String password = "1234ab";
        new P01_HomePage(driver).clickonlogintap();
        Thread.sleep(2000);
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        Thread.sleep(2000);
        new P04_HomePageWithLogin(driver).opencurrencymenu();
        Thread.sleep(800);
        new P04_HomePageWithLogin(driver).switchcurrentcurrency();
        Thread.sleep(3000);

    }
}
