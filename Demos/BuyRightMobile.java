package practical.Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BuyRightMobile{
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

        try {
            // Step 1: Navigate to Flipkart's homepage
            driver.get("https://www.flipkart.com/");
            System.out.println("Navigated to Flipkart homepage.");
        
            // Step 2: Search for a product (e.g., "iPhone")
            WebElement searchBox = driver.findElement(By.name("q")); // Search input field
            searchBox.sendKeys("iPhone");
            searchBox.submit(); // Submit the search form
            System.out.println("Searched for iPhone.");

            // Step 3: Click on the first product from the search results
            WebElement firstProduct = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]/div[1]/img[1]")); // CSS selector for the first product
            firstProduct.click();
            System.out.println("Clicked on the first product.");

            // Step 4: Switch to the new tab where the product page is loaded
            Set<String> windowHandles = driver.getWindowHandles();
            String parentWindow = driver.getWindowHandle();
            for (String window : windowHandles) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window); // Switch to the product window
                }
            }
            
            // Step 5: Click the "Add to Cart" button
            WebElement addToCartButton = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")); // Xpath for Add to Cart button
            addToCartButton.click();
            System.out.println("Product added to cart.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           driver.quit();
        }
    }
}
