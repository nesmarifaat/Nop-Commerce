package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P04_HomePageWithLogin;

import static testcases.TC01_Registration.email;
import static utilities.Utility.generaterandom;

//import static testcases.TC01_Registration.Email;


public class TC06_SelectRandomCategories extends TestBase{
//    P01_HomePage homePage;
//    P03_Login loginpage;
//    P04_HomePageWithLogin HPL;
//    String password="abcd123";



    @Test(priority = 1,description = "Select one Category Random")
    public void selectrandomcategory_P() throws InterruptedException {
        String password="1234ab";
        int randomcategory=generaterandom(7);
        new P01_HomePage(driver).clickonlogintap();
        Thread.sleep(1500);
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        Thread.sleep(1500);
        new P04_HomePageWithLogin(driver).chooserandomcategory();
        Thread.sleep(3000);








//        homePage=new P01_HomePage(driver);
//        loginpage=new P03_Login(driver);
//        HPL=new P04_HomePageWithLogin(driver);
//        homePage.clickLoginTap();
//        loginpage.sendemail(Email);
//        loginpage.enterpassword(password);
//        loginpage.remembermecheckbox();
//        loginpage.clickloginbutton();
//        HPL.chooserandomcategory();
//        Thread.sleep(1500);
//        HPL.scrollDown();
//        Thread.sleep(4000);
//        driver.navigate().back();
//        Thread.sleep(1000);
//        HPL.hoveronapparel();
//        Thread.sleep(2000);
//        HPL.clickonapparel();
//        Thread.sleep(2000);
//        HPL.clickonapparelsubcategory();
//        Thread.sleep(1500);
//        HPL.scrollDown();
//        Thread.sleep(4000);

    }
}
