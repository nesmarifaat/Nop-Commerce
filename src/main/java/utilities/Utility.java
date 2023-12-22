package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Utility {

    static WebDriver driver;

    //TODO: Method To generate random firstname
    public static String getRandomFirstName() {
        String[] firstNames = {
                "Noah", "Ahmed", "Shady", "Dalida", "Amr", "Nesma", "Nada", "Elijah", "Alexander", "Oliver"
        };

        Random random = new Random();
        int index = random.nextInt(firstNames.length);
        return firstNames[index];
    }

    // TODO: Capture Screenshot
    // TODO: Capture Screenshot
    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        Date currntDate=new Date();
        screenshotName=screenshotName+" "+currntDate.toString().replace(" ","-").replace(":","-");
        try {
            FileHandler.copy(takesScreenshot.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir")
                    + "/src/test/resources/Screenshots/"+ screenshotName + ".png"));
        } catch (WebDriverException | IOException e) {
            e.printStackTrace();
        }
    }

    //TODO: Method to generate random lastname
    public static String getRandomLastName() {
        String[] lastNames = {
                "Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Taylor", "Anderson", "Thomas"
        };

        Random random = new Random();
        int index = random.nextInt(lastNames.length);
        return lastNames[index];
    }


    //TODO: Method To select Random Index

    public static int generaterandom(int max) {
        Random random = new Random();
        return random.nextInt(max) + 1;

    }


    //TODO: Method to generate random email
    public static String generateRandomEmail() {

        // Generate a random first name
        String firstName = getRandomFirstName();

        // Generate a random last name
        String lastName = getRandomLastName();

        // Generate a random domain from a list of common domains
        String[] domains = {"gmail.com", "yahoo.com", "outlook.com", "hotmail.com", "aol.com"};
        Random random = new Random();
        String domain = domains[random.nextInt(domains.length)];

        // Generate a random number between 1 and 1000 for the email address prefix
        int prefix = random.nextInt(1000) + 1;

        // Combine the generated parts to form the email address
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + prefix + "@" + domain;

        // Return the generated email address
        return email;
    }


}
