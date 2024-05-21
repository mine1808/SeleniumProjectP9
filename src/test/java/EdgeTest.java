import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    @Test
    public void test() {
        // Initiate webdriver
        WebDriver driver;
        driver = new EdgeDriver();

        // Set property untuk versi 4.11 kebawah
        // System.setProperty("webdriver.chrome.driver", "~/msedgedriver");

        // Maximize windows browser
        driver.manage().window().maximize();

        // Navigate to google homepage
        driver.get("https://sv.ugm.ac.id/");

        // Set timeout 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait from selenium

        // Get current title of the page
        String title = driver.getTitle();
        System.out.println("title: " + title);

        // Get current url
        String url = driver.getCurrentUrl();
        System.out.println("url: " + url);

        //Quit
        driver.quit();
    }
}
