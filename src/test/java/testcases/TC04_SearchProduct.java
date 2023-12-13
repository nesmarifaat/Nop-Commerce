package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P04_HomePageWithLogin;

import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;

//import static testcases.TC01_Registration.Email;

public class TC04_SearchProduct extends TestBase{

//    P01_HomePage homePage;
//    P03_Login loginpage;
//    P04_HomePageWithLogin HPL;
//    String password="abcd123";
//    String Searchbyword="Apple";

    @Test(priority = 1, description = "search for available product")
    public void searchavailableproduct_P() throws InterruptedException {
        String searchword="Apple";
        String password="1234ab";
        new P01_HomePage(driver).clickonlogintap();
        Thread.sleep(2000);
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        Thread.sleep(2000);
        new P04_HomePageWithLogin(driver).searchproductfunctionality(searchword);
        Thread.sleep(800);
        new P04_HomePageWithLogin(driver).clickonsearchbutton();
        new P04_HomePageWithLogin(driver).scrollDown();
        Thread.sleep(3000);

//        homePage=new P01_HomePage(driver);
//        loginpage=new P03_Login(driver);
//        HPL=new P04_HomePageWithLogin(driver);
//        homePage.clickLoginTap();
//        Thread.sleep(1000);
//        loginpage.sendemail(Email);
//        loginpage.enterpassword(password);
//        loginpage.remembermecheckbox();
//        loginpage.clickloginbutton();
//        HPL.fillsearchfeild(Searchbyword);
//        Thread.sleep(1500);
//        HPL.clicksearchbutton();
//        Thread.sleep(1000);
//        HPL.scrollDown();
//        Thread.sleep(5000);

    }
}
