package practical.Demos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            
            driver.get("https://www.chess.com/");
            driver.manage().window().maximize();

            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
            System.out.println("Scrolled to the bottom of the page.");
           
            Thread.sleep(2000);

            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
            System.out.println("Scrolled back to the top of the page.");
           
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
