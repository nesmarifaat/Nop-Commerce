package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P04_HomePageWithLogin;
import pages.P05_Products;

//import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.email;
import static utilities.Utility.generaterandom;

public class TC11_AddToWishlist extends TestBase {


    @Test(priority = 1, description = "Add Product to Wish List")

    public void addproducttowhishlist_P() throws InterruptedException {
        String password = "1234ab";
        String info = "Nesma";
        new P01_HomePage(driver).clickonlogintap();
        Thread.sleep(1000);
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        Thread.sleep(2000);
        new P04_HomePageWithLogin(driver).clickongiftcards();
        Thread.sleep(1500);
        new P05_Products(driver).scrollDown().clickoncard2().scrollDown();
        Thread.sleep(800);
        new P05_Products(driver).fillgiftcardfields(info).addproducttowishlist();
        Thread.sleep(3000);


    }
}
