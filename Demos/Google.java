package practical.Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("Mukul Pillay");
		driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'Mukul-pillay Cricket Profile - Matches, Stats, and')]")).click();
		
		driver.close();
		
	}

}
