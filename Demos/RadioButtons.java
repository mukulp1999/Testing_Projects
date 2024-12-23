package practical.Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='male']"));
	    WebElement checkbox = driver.findElement(By.xpath("//body/div[@id='page']/div[@id='content']/div[@id='primary']/main[@id='main']/article[@id='post-1089']/div[1]/div[1]/div[1]/form[2]/input[1]"));
	    
	    if(!radiobutton.isSelected()) {
	    	radiobutton.click();
	    }
	    if(!checkbox.isSelected()) {
	    	checkbox.click();
	    } 
	   // driver.quit();
	}
}
