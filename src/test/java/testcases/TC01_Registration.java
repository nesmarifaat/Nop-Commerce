package testcases;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_Registration;
import org.testng.asserts.SoftAssert;
import utilities.Utility;

import static utilities.Utility.*;

public class TC01_Registration extends TestBase {


    static String email=faker.internet().emailAddress();
    static String password=faker.internet().password();
    String firstname = faker.name().firstName();
    String lastname = faker.name().lastName();
    int randomday = generaterandom(28);
    int randommonth = generaterandom(12);
    int randomyear = generaterandom(20);

    String companyname = "Software";

//    String confirmpassword = "1234ab";
    String confirmpasswordII = "1234abbb";



    @Description(" Check Registration Functionality with right data")
    @Severity(SeverityLevel.BLOCKER)
    @Test(priority = 1, description = "Register New User With Valid Data")
    public void registerNewUserWithValidData_P() {


        new P01_HomePage(driver).clickonregistrationtap();

        new P02_Registration(driver).choosegender().fillfirstname(firstname).filllastname(lastname);

        new P02_Registration(driver).selectdayofbirth(randomday).selectmonth(randommonth).selectyearofbirth(randomyear).fillemail(email).fillcompanyname(companyname).fillpassword(password).fillconfirmpassword(password);

        new P02_Registration(driver).clickonregisterbutton();

        captureScreenshot(driver, "P_Registration");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P02_Registration(driver).validateregistrationmsg());
        softAssert.assertAll();


    }

    @Description("N_Check Registration Functionality with not matching password")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2, description = "check registration with not matching confirmation password")
    public void checkregwithnotmatchingpassword_N() {
        SoftAssert softAssert = new SoftAssert();
        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();


        email = faker.internet().emailAddress();
        new P01_HomePage(driver).clickonregistrationtap();
        new P01_HomePage(driver).clickonregistrationtap();

        new P02_Registration(driver).choosegender().fillfirstname(firstname).filllastname(lastname);

        new P02_Registration(driver).selectdayofbirth(randomday).selectmonth(randommonth).selectyearofbirth(randomyear).fillemail(email).fillcompanyname(companyname).fillpassword(password).fillconfirmpassword(confirmpasswordII);

        new P02_Registration(driver).clickonregisterbutton();

        captureScreenshot(driver, "N_Registration");
        softAssert.assertTrue(new P02_Registration(driver).validatewrongpassmsg());
        softAssert.assertAll();

    }


}
