package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_Login;
import pages.P04_HomePageWithLogin;
import pages.P05_Products;

import static testcases.TC01_Registration.email;

//import static testcases.TC01_Registration.Email;

public class TC07_ColorFilter extends TestBase{

//    P01_HomePage homePage;
//    P03_Login loginpage;
//    P04_HomePageWithLogin HPL;
//    P05_Products product;
//    String password="abcd123";

    @Test(priority = 1,description = "Filter Product By Color")

    public void filterproductbycolor_P() throws InterruptedException {
        String password="1234ab";
        new P01_HomePage(driver).clickonlogintap();
        Thread.sleep(1000);
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        Thread.sleep(2000);
        new P04_HomePageWithLogin(driver).movetoapparelcategory().clickonshoessubcategory();
        Thread.sleep(2000);
        new P05_Products(driver).chooserandomfiltercolor();
        Thread.sleep(3000);


//        homePage=new P01_HomePage(driver);
//        loginpage=new P03_Login(driver);
//        HPL=new P04_HomePageWithLogin(driver);
//        product=new P05_Products(driver);
//        homePage.clickLoginTap();
//        loginpage.sendemail(Email);
//        loginpage.enterpassword(password);
//        loginpage.remembermecheckbox();
//        loginpage.clickloginbutton();
//        Thread.sleep(1500);
//        HPL.clickonapparel();
//        Thread.sleep(2000);
//        product.clickonshoessubcategory();
//        Thread.sleep(1000);
//        HPL.scrollDown();
//        Thread.sleep(1000);
//        product.chooseshoescolor();
//        Thread.sleep(4000);

    }
}
