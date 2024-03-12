import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;  // Import ChromeOptions
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BuildJobTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        // Create ChromeOptions instance
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Add the --headless argument

        // Initialize ChromeDriver with options
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicit wait
        driver.get("https://demoqa.com/");
    }

    // ... rest of your test methods ...

    @AfterMethod
    public void tearDown() {
        driver.quit(); // Using quit() to close all browser windows
    }
}
