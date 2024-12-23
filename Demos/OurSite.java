package practical.Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OurSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		  driver.get("https://buy-right-mobile.vercel.app/");
		  driver.manage().window().maximize();
	      String pageTitle = driver.getTitle();
	      Assert.assertTrue(pageTitle.contains("Buy Right Phone"), "Website title is not as expected");
	      System.out.println(driver.getTitle());
	      
	      driver.findElement(By.xpath("/html/body/div/main/div/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("iphone");
	      ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
	      
	      driver.findElement(By.xpath("/html/body/div/main/div/section[2]/div[1]/div/div[3]/span")).click();

	}

}
