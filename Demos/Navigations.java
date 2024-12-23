package practical.Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
         try {
            
            driver.get("https://swayam.gov.in/nc_details/NPTEL");
            System.out.println("Navigated to homepage.");

            WebElement about = driver.findElement(By.linkText("About Swayam"));
            about.click();
            System.out.println("Navigated to About Swayam.");

            String PageTitle = driver.getTitle();
            System.out.println("Page Title: " + PageTitle);

            driver.navigate().back();
            System.out.println("Returned to homepage.");

            WebElement courses = driver.findElement(By.linkText("All Courses"));
            courses.click();
            System.out.println("Navigated to All courses.");

            String coursePageTitle = driver.getTitle();
            System.out.println("Learn Page Title: " + coursePageTitle);

            driver.navigate().back();
            System.out.println("Returned to homepage.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           
            driver.quit();
        }
    }
}

