package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ElectronicsTest {
	@Test (invocationCount = 10,threadPoolSize = 10,enabled =false) //(priority = 0)
	public void register() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("register");
		Thread.sleep(2000);
		//driver.get("asdf");
		driver.quit();
		}
	@Test (dependsOnMethods = "register")//(priority = 1)
	public void login() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("login");
		driver.quit();
		}
	@Test (dependsOnMethods ="login" )//(priority = 2)
	public void addToCart() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("add to cart");
		driver.quit();
		
	}
	@Test (dependsOnMethods = "addToCart")//(priority = 3)
	public void payment() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("payment");
		driver.quit();
		
	}
	@Test (dependsOnMethods = "payment")//(priority = 4)
	public void confirmOrder() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("confirmOrder");
		driver.quit();
		
	}
}
