package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public static int generaterandom(int max)
    {
    Random random=new Random();
    return random.nextInt(max)+1;

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


///html[1]/body[1]/div[6]/div[2]/ul[2]/li/a

//    public static int navigateRandomLinks() {
//        // Find all links on the page
//        List<WebElement> links = driver.findElements(By.xpath("//html[1]/body[1]/div[6]/div[2]/ul[2]/li/a"));
//
//        // Limit the number of links to 7
//        links = links.subList(0, 7);
//
//        // Randomly select a link and navigate to it
//        Random random = new Random();
//        int randomIndex = random.nextInt(links.size());
//        WebElement randomLink = links.get(randomIndex);
//        randomLink.click();
//        return randomIndex;
//    }




}
