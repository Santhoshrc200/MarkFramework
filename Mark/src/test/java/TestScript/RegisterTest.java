package TestScript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {
	@Test
	public  void registerPage_001() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.com");
		driver.switchTo().activeElement().sendKeys("Car",Keys.ENTER);
	}
	@Test
	public  void registerPage_002() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.com");
		driver.switchTo().activeElement().sendKeys("car",Keys.ENTER);
	}
}
