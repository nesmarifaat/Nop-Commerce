package testcases;

import com.github.javafaker.CreditCardType;
import org.testng.annotations.Test;
import pages.*;

//import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.email;
import static utilities.Utility.generaterandom;

public class TC12_SuccessfulOrder extends TestBase {


    @Test(priority = 1, description = "Create a Successful Order for a random chosen product")

    public void createsuccessfulOrder_P() throws InterruptedException {
        int country = generaterandom(1);
        int state = generaterandom(8);
        String city = "New York";
        String password = "1234ab";
        String cardcode = "269";
        String postalcode = faker.address().zipCode();
        String phonenumber = faker.phoneNumber().cellPhone();
        String address = faker.address().streetAddress();
        int expirationyear = generaterandom(8);
        int expiremonth = generaterandom(12);
        String cardholdername = faker.name().fullName();
        String cardnumber = faker.finance().creditCard(CreditCardType.VISA);
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


    }
}
