package GeneralLibrary;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ObjectRepository.LoginPage;
import ObjectRepository.WelcomePage;
import net.bytebuddy.implementation.bind.MethodNameEqualityResolver;

public class BaseClass {

	public WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	@BeforeSuite
	public void bs() {
		report=new ExtentReports("./Reports/report.html");
		System.out.println("before suite");
	}
	@BeforeTest
	public void bt() {
		System.out.println("before test");
	}
	@BeforeClass
	public void bc() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod
	public void login(Method method) {
	    String methodName=method.getName();
	    test=report.startTest(methodName);
		WelcomePage w=new WelcomePage(driver);
		w.getLoginlink().click();
		LoginPage l=new LoginPage(driver);
		l.getEmailTF().sendKeys("markantony123@gmail.com");
		l.getPassTF().sendKeys("Mark@123");
		l.getLoginbtn().click();
		System.out.println("before method ");
		
	}
	@AfterSuite
	public void as() {
		report.flush();
		System.out.println("after suite");
	}
	@AfterTest
	public void at() {
		System.out.println("after test");
	}
	@AfterClass
	public void ac() {
		System.out.println("After class");
		driver.quit();
	}
	@AfterMethod
	public void logout() {
		report.endTest(test);
		WelcomePage w=new WelcomePage(driver);
		System.out.println("After method")	;
		w.getLogout().click();
	}
}
