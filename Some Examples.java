import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomationTest {
    public static void main(String[] args) {
        // Set up Chrome WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        // Navigate to a website
        driver.get("https://example.com");
        
        // Find an element and perform an action
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Automation Testing");
        searchBox.submit();
        
        // Verify the result
        WebElement result = driver.findElement(By.xpath("//h3[contains(text(),'Introduction to Automation Testing')]"));
        if (result.isDisplayed()) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
        
        // Close the browser
        driver.quit();
    }
}
