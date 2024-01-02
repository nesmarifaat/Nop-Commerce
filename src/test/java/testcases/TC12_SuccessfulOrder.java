package testcases;

import com.github.javafaker.CreditCardType;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

//import static testcases.TC01_Registration.Email;
import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;
import static utilities.Utility.captureScreenshot;
import static utilities.Utility.generaterandom;

public class TC12_SuccessfulOrder extends TestBase {
    int country = generaterandom(1);
    int state = generaterandom(5);
    String city = "New York";
    String cardcode = "269";
    String postalcode = faker.address().zipCode();
    String phonenumber = faker.phoneNumber().cellPhone();
    String address = faker.address().streetAddress();
    int expirationyear = generaterandom(8);
    int expiremonth = generaterandom(12);
    String cardholdername = faker.name().fullName();
    String cardnumber = faker.finance().creditCard(CreditCardType.VISA);

    @Description(" E2E Scnario for Purchase Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1, description = "Create a Successful Order for a random chosen product")

    public void createsuccessfulOrder_P() {

        new P01_HomePage(driver).clickonlogintap();
        new P03_Login(driver).fillemail(email).fillpassword(password).clickloginbutton();
        new P04_HomePageWithLogin(driver).clickondigitaldownloads();
        new P05_Products(driver).scrollDown().clickonnightvision().scrollDown().addproducttocart();
        new P05_Products(driver).clickonshippingcart();
        new P06_ShippingCart(driver).scrollDown().checktermsofservice().clickoncheckout();
        new P07_BillingAddress(driver).choosecountry(country);
        new P07_BillingAddress(driver).selectstate().choosecity(city).filladdress(address).fillpostalcode(postalcode).fillphonenumber(phonenumber).clickoncontinuebutton();
        new P08_PaymentMethod(driver).choosepaymentmethod().clickoncontinuebutton();
        new P09_PaymentInformation(driver).fillcardholdername(cardholdername).fillcardnumber(cardnumber).selectexpiremonth(expiremonth).selectexpireyear(expirationyear).fillcardcode(cardcode).clickonsubmitpayment().clickoncontinuebutton();
        new P10_ConfirmOrder(driver).clickonconfirmbutton();
        captureScreenshot(driver, "Purchase Product E2E");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P10_ConfirmOrder(driver).checkordernumberlink());
        softAssert.assertAll();

    }
}
