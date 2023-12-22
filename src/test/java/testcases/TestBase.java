package testcases;

import com.github.javafaker.Faker;
import common.MyScreenRecorder;
import drivers.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static drivers.DriverHolder.setDriver;

public class TestBase {
    WebDriver driver;
    Faker faker = new Faker();
@BeforeSuite
public void defineSuite() throws Exception {
    MyScreenRecorder.startRecording("E2E Nop-Commerce");
}
    @Parameters("browser")
    @BeforeTest
    public void setupDriver(String browser) {
        driver = DriverFactory.getNewInstance(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        setDriver(driver);

        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
        Thread.currentThread().interrupt();
    }

    @AfterSuite
    public void endSuite () throws Exception {
        MyScreenRecorder.stopRecording();
    }
}
