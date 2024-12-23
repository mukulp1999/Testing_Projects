package practical.Demos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Nosuchexception {
    public static void main(String[] args) throws IOException {
       
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://chess.com"); 
            WebElement element = driver.findElement(By.id("nonExistentElementId"));
            element.click();
            System.out.println("Element clicked successfully!");
        } 
        catch (NoSuchElementException e) {
           System.out.println("Element not found: " + e.getMessage());
           File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           FileUtils.copyFile(screenshot,new File("F:\\automate screenshot\\screen.png"));
           System.out.println("Screenshot Captured");
        } 
        finally {
            driver.quit();
        }
    }
}
