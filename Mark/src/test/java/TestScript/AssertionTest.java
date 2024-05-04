package TestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ObjectRepository.BooksPage;
import ObjectRepository.RegisterPage;
import ObjectRepository.WelcomePage;

public class AssertionTest {
	
	@Test
	public void booksTest_001() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage w=new WelcomePage(driver);
		BooksPage b=new BooksPage(driver);
		RegisterPage r=new RegisterPage(driver);
		//CLICK ON BOOKS LINK
		w.getBookslink().click();
		String act=b.getBookstitle().getText();
		//VERIFY BOOKS PAGE IS DISPLAYED
		//HARD ASSERT
		//Assert.assertEquals(act, "Books");
		
		SoftAssert soft=new SoftAssert();
		//soft.assertEquals(act, "Computers");
		
		
		//soft.assertEquals(b.getBookstitle().isDisplayed(),false);
		soft.fail();
		soft.assertTrue(b.getBookstitle().isDisplayed());
		//soft.assertFalse(b.getBookstitle().isDisplayed());
		soft.assertAll();
		driver.quit();
		
	}

}
