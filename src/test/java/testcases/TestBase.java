package testcases;

import com.github.javafaker.Faker;
import drivers.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import static drivers.DriverHolder.setDriver;

public class TestBase {
    WebDriver driver;
    Faker faker=new Faker();

    @Parameters("browser")
    @BeforeTest
    public void setupDriver(String browser){
        driver = DriverFactory.getNewInstance(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        setDriver(driver);

//        //TODO: setup chrome driver using webdriver manager
//        WebDriverManager.chromedriver().setup();
//
//        //TODO: Define driver object
//        driver=new ChromeDriver();
//
//        //TODO: Configure driver
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //TODO: Start the WEbsite
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
        Thread.currentThread().interrupt();
    }
}
