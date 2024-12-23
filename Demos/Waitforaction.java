package practical.Demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitforaction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.chess.com/login_and_go?returnUrl=https://www.chess.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//body/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("mukulpillay1999@gmail.com");
		driver.findElement(By.xpath("//body/div[1]/div[1]/main[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("pacific24");
		driver.findElement(By.xpath("//button[@id='login']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ad = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[1]/div[2]/main[1]/div[1]/div[8]/div[1]/div[2]/div[1]/div[2]/button[1]")));
		ad.click();
	}	
}
