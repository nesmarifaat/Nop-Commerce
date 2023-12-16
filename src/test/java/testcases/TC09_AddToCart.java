package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P04_HomePageWithLogin;
import pages.P05_Products;

//import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.email;
import static utilities.Utility.generaterandom;

public class TC09_AddToCart extends TestBase {


    @Test(priority = 1, description = "Click On Select Size Menu and choose size then add to cart")
    public void addproducttocart_P() throws InterruptedException {

        String password = "1234ab";
        new P01_HomePage(driver).clickonlogintap();
        Thread.sleep(1000);
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        Thread.sleep(2000);
        new P04_HomePageWithLogin(driver).clickondigitaldownloads();
        Thread.sleep(2000);
        new P05_Products(driver).scrollDown().clickonnightvision().scrollDown();
        Thread.sleep(800);
        new P05_Products(driver).addproducttocart();
        Thread.sleep(3000);


    }
}
