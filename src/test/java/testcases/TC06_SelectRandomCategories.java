package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P04_HomePageWithLogin;

import static testcases.TC01_Registration.email;
import static utilities.Utility.generaterandom;

//import static testcases.TC01_Registration.Email;


public class TC06_SelectRandomCategories extends TestBase {


    @Test(priority = 1, description = "Select one Category Random")
    public void selectrandomcategory_P() throws InterruptedException {
        String password = "1234ab";
        int randomcategory = generaterandom(7);
        new P01_HomePage(driver).clickonlogintap();
        Thread.sleep(1500);
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        Thread.sleep(1500);
        new P04_HomePageWithLogin(driver).chooserandomcategory();
        Thread.sleep(3000);


    }
}
