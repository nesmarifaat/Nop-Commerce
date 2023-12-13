package testcases;

import com.github.javafaker.CreditCardType;
import org.testng.annotations.Test;
import pages.*;

//import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.email;
import static utilities.Utility.generaterandom;

public class TC12_SuccessfulOrder extends TestBase{
//    P01_HomePage homePage;
//    P03_Login loginpage;
//    P04_HomePageWithLogin HPL;
//    P05_Products product;
//    P06_ShippingCart shippingcart;
//    P07_BillingAddress Billingaddress;
//    P08_PaymentMethod paymentmethod;
//    P09_PaymentInformation paymentinfo;
//    P10_ConfirmOrder confirmorder;
//    String password="abcd123";
//
//    int randomshoessize=generaterandom(4);
//    int choosecolormenu=generaterandom(2);
//    int choosecountry=generaterandom(1);
//    int expirationyear=generaterandom(8);
//    String cityname="New York";
//    String Firstaddress=faker.address().city();
//
//    String postalcode=faker.address().zipCode();
//    String phonenumber=faker.phoneNumber().cellPhone();
//    String Cardholdername=faker.name().fullName();
//   String cardcode="269";
//
//    String cardnumber=faker.finance().creditCard(CreditCardType.VISA);


    @Test(priority = 1,description = "Create a Successful Order for a random chosen product")

    public void createsuccessfulOrder_P() throws InterruptedException {
    int country=generaterandom(1);
    int state=generaterandom(8);
        String city="New York";
        String password="1234ab";
        String cardcode="269";
        String postalcode=faker.address().zipCode();
        String phonenumber=faker.phoneNumber().cellPhone();
        String address=faker.address().streetAddress();
        int expirationyear=generaterandom(8);
        int expiremonth=generaterandom(12);
        String cardholdername=faker.name().fullName();
        String cardnumber=faker.finance().creditCard(CreditCardType.VISA);
        new P01_HomePage(driver).clickonlogintap();
        Thread.sleep(1000);
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        Thread.sleep(1000);
        new P04_HomePageWithLogin(driver).clickondigitaldownloads();
        Thread.sleep(1000);
        new P05_Products(driver).scrollDown().clickonnightvision().scrollDown().addproducttocart();
        Thread.sleep(4000);
        new P05_Products(driver).clickonshippingcart();
        Thread.sleep(1000);
        new P06_ShippingCart(driver).scrollDown().checktermsofservice().clickoncheckout();
        Thread.sleep(1000);
        new P07_BillingAddress(driver).choosecountry(country);
        Thread.sleep(3000);
        new P07_BillingAddress(driver).selectstate(state).choosecity(city).filladdress(address).fillpostalcode(postalcode).fillphonenumber(phonenumber).clickoncontinuebutton();
        Thread.sleep(1000);
        new P08_PaymentMethod(driver).choosepaymentmethod().clickoncontinuebutton();
        Thread.sleep(1500);
        new P09_PaymentInformation(driver).fillcardholdername(cardholdername).fillcardnumber(cardnumber).selectexpiremonth(expiremonth).selectexpireyear(expirationyear).fillcardcode(cardcode).clickonsubmitpayment().clickoncontinuebutton();
        Thread.sleep(3000);
        new P10_ConfirmOrder(driver).clickonconfirmbutton();
        Thread.sleep(3000);


//        homePage=new P01_HomePage(driver);
//        loginpage=new P03_Login(driver);
//        HPL=new P04_HomePageWithLogin(driver);
//        product=new P05_Products(driver);
//        shippingcart=new P06_ShippingCart(driver);
//        Billingaddress=new P07_BillingAddress(driver);
//        paymentmethod=new P08_PaymentMethod(driver);
//        paymentinfo=new P09_PaymentInformation(driver);
//        confirmorder=new P10_ConfirmOrder(driver);
//        homePage.clickLoginTap();
//        loginpage.sendemail(Email);
//        loginpage.enterpassword(password);
//        loginpage.remembermecheckbox();
//        loginpage.clickloginbutton();
//        Thread.sleep(2000);
//        HPL.clickondigitaldownloads();
//        Thread.sleep(3000);
//        product.clickonnightvisionimage();
//        Thread.sleep(3000);
//        product.clickonaddtocartbutton();
//        Thread.sleep(4000);
//        product.clickonshippingcart();
//        Thread.sleep(2000);
//        shippingcart.clickonagreetermsofservice();
//        Thread.sleep(2000);
//        shippingcart.clickoncheckoutbutton();
//        Thread.sleep(2000);
//        Billingaddress.selectcountry(choosecountry);
//        Thread.sleep(1500);
//        Billingaddress.selectstate(16);
//        Billingaddress.fillcityname(cityname);
//        Thread.sleep(500);
//        Billingaddress.fillfirstaddres(Firstaddress);
//        Thread.sleep(500);
//        Billingaddress.fillpostalcode(postalcode);
//        Thread.sleep(500);
//        Billingaddress.fillphonenumber(phonenumber);
//        Thread.sleep(500);
//        Billingaddress.clickoncontinuebutton();
//        Thread.sleep(2000);
//        paymentmethod.choosecreditcard();
//        Thread.sleep(1500);
//        paymentmethod.clickoncontinurebutton();
//        Thread.sleep(2000);
//        paymentinfo.fillcardholderfield(Cardholdername);
//        Thread.sleep(1000);
//        paymentinfo.fillcardnumber(cardnumber);
//        Thread.sleep(1000);
//        paymentinfo.selectexpirationmonth(8);
//        paymentinfo.selectexpirationyear(expirationyear);
//        Thread.sleep(1000);
//        paymentinfo.fillcardcode(cardcode);
//        Thread.sleep(1500);
//        paymentinfo.clickoncontinuebutton();
//        Thread.sleep(2000);
//        confirmorder.clickonconfirmorderbutton();
//        Thread.sleep(4000);




    }
}
