package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_Registration;
import org.testng.asserts.SoftAssert;

import static utilities.Utility.*;

public class TC01_Registration extends TestBase{

//    String firstName=faker.name().firstName();
//    String lastname=faker.name().lastName();
//    String password="abcd123";
//    static String Email;
//    String confirmpassword="abcd123";
//    String specificday;
//    int gender=generaterandom(2);
//    int randomday=generaterandom(28);
//    String companyname= "abc";
//    int month=generaterandom(12);
//    int year=generaterandom(30);
//    P01_HomePage homePage;
//    P02_Registration registrationPage;

static String email;
    static String password;

    @Test(priority = 1,description = "Register New User With Valid Data")
    public void registerNewUserWithValidData_P() throws InterruptedException {

       String firstname=faker.name().firstName();
       String lastname=faker.name().lastName();
       int randomday=generaterandom(28);
       int randommonth=generaterandom(12);
       int randomyear=generaterandom(20);
       email=faker.internet().emailAddress();
       String companyname="Software";
       String password="1234ab";
       String confirmpassword="1234ab";

        new P01_HomePage(driver).clickonregistrationtap();
        //Thread.sleep(1500);
        new P02_Registration(driver).choosegender().fillfirstname(firstname).filllastname(lastname);
        Thread.sleep(800);
        new P02_Registration(driver).selectdayofbirth(randomday).selectmonth(randommonth).selectyearofbirth(randomyear).fillemail(email).fillcompanyname(companyname).fillpassword(password).fillconfirmpassword(confirmpassword);
        Thread.sleep(800);
        new P02_Registration(driver).clickonregisterbutton();
        Thread.sleep(1000);





//        Email=faker.internet().emailAddress();
//        homePage=new P01_HomePage(driver);
//        registrationPage=new P02_Registration(driver);
//        // Test Scenario
//        homePage.clickRegisterTap();
//        Thread.sleep(2000);
//        registrationPage.chooseGender();
//        registrationPage.addFirstname(firstName);
//        registrationPage.fillLastname(getRandomFirstName());
//        registrationPage.selectDay(randomday);
//        Thread.sleep(3000);
//       registrationPage.selectmonth(month);
//        registrationPage.selectyear(year);
//        //registrationPage.fillemail(generateRandomEmail());
//        registrationPage.fillemail(Email);
//        registrationPage.companyname(companyname);
//        Thread.sleep(2000);
//        registrationPage.fillpassword(password);
//        Thread.sleep(2000);
//        registrationPage.confirmpassword(confirmpassword);
//        registrationPage.registerbutton();
//        Thread.sleep(4000);
//        System.out.println(getRandomFirstName());
//        System.out.println(getRandomLastName());
//        System.out.println(generateRandomEmail());
//        System.setProperty("email",generateRandomEmail());
//
//

    }

    @Test(priority = 2, description = "check registration with not matching confirmation password")
    public void checkregwithnotmatchingpassword_N() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        String firstname=faker.name().firstName();
        String lastname=faker.name().lastName();
        int randomday=generaterandom(28);
        int randommonth=generaterandom(12);
        int randomyear=generaterandom(20);
        String companyname="Software";
        String password="1234ab";
        String confirmpassword="123aaa";
        email=faker.internet().emailAddress();
        new P01_HomePage(driver).clickonregistrationtap();
        Thread.sleep(1000);
        new P02_Registration(driver).choosegender().fillfirstname(firstname).filllastname(lastname).selectdayofbirth(randomday).selectmonth(randommonth).selectyearofbirth(randomyear).fillemail(email).fillcompanyname(companyname).fillpassword(password).fillconfirmpassword(confirmpassword).clickonregisterbutton();
        Thread.sleep(2500);



    }



}
