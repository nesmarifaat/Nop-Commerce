package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P04_HomePageWithLogin;
import pages.P05_Products;

import static testcases.TC01_Registration.email;

//import static testcases.TC01_Registration.Email;

public class TC10_AddToComparelist extends TestBase {

    @Test(priority = 1, description = "Add Product To Compare list")
    public void addproducttocomparelist_P() throws InterruptedException {
        String password = "1234ab";
        new P01_HomePage(driver).clickonlogintap();
        Thread.sleep(1000);
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        Thread.sleep(2000);
        new P04_HomePageWithLogin(driver).movetoelectronics().clickoncellphone();
        Thread.sleep(2000);
        new P05_Products(driver).scrollDown().clickonnokialumia();
        new P05_Products(driver).scrollDown().addproducttocomparelist();
        Thread.sleep(3000);

    }
}
