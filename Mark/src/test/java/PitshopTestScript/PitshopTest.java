package PitshopTestScript;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v120.autofill.model.Address;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PitshopObjRepository.AccSettingsPage;
import PitshopObjRepository.AddressPage;
import PitshopObjRepository.CartSectionPage;
import PitshopObjRepository.ComparePage;
import PitshopObjRepository.HelmetsPage;
import PitshopObjRepository.HomePage;
import PitshopObjRepository.LoginPage;
import PitshopObjRepository.ReviewPage;
import PitshopObjRepository.SignupPage;
import PitshopObjRepository.WelcomePage;

public class PitshopTest {
	private WebDriver driver;
	
	@BeforeMethod(groups= {"skipSetup"})
	public void entry() {
		//DISABLE NOTIFICATIONS
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		//LAUNCH BROWSER
		driver=new ChromeDriver(opt);
		//MAXIMIZE
		driver.manage().window().maximize();
		//NAVIGATE TO URL
		driver.get("https://bandidospitstop.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod(groups= {"skipSetup"})
	public void exit() {
		if(driver!=null) {
		driver.quit();
		}
	}
	
	@Test
	public void create_Account_001() {
	
				WelcomePage w=new WelcomePage(driver);
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement	account =w.getAccountlink();
				jse.executeScript("arguments[0].click()", account);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//CREATE NEW ACCOUNT LINK
				LoginPage l=new LoginPage(driver);
				l.getCreateaccountlink().click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//SIGNUP PAGE LINK
				SignupPage s=new SignupPage(driver);
				s.getFirstname().sendKeys("ROLEX");
				s.getLastname().sendKeys("SIR");
				Random r=new Random();
				int n=r.nextInt(900)+100;
				s.getEmail().sendKeys("rolexsir"+n+"@gmail.com");
				s.getPassword().sendKeys("rolex@123");
				s.getCreateaccountbutton().click();
				
				}
		@Test
		public void login_002() {
			
			WelcomePage w=new WelcomePage(driver);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement	account =w.getAccountlink();
			jse.executeScript("arguments[0].click()", account);
			
			//CLICK FOR LOGIN
			LoginPage l=new LoginPage(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			l.getEmail().sendKeys("rolexsir123@gmail.com");
			l.getPass().sendKeys("rolex@123");
			l.getSignbtn().click();		
		}
		@Test
		public void product_Search_003() {
			login_002();
			//SEARCH THE PRODUCT 
			HomePage h=new HomePage(driver);
			h.getSearchbar().sendKeys("helmet",Keys.ENTER);
			
		}
		@Test
		public void addToCart_004() {
			login_002();
			//ADD THE PRODUCT TO CART SECTION
			HomePage h=new HomePage(driver);
			Actions mouse=new Actions(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//MOUSEHOVER TO HELMETS AND ACCESSORIES
			mouse.moveToElement(h.getHelmetlink()).perform();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//CLICK ON FULL FACE HELMET LINK
			mouse.moveToElement(h.getFullfacehelmetlink()).perform();
			h.getFullfacehelmetlink().click();
			//CLICK ON AXOR HELMET AND NAVIGATE TO PRODUCT DESCRIPTION
			HelmetsPage helmet=new HelmetsPage(driver);
			helmet.getAxorhemet().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//CLICK ON ADD TO CART BUTTON
			helmet.getAxoraddtocart().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			}
		@Test
		public void removecart_005() {
			addToCart_004();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			CartSectionPage cart=new CartSectionPage(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			cart.getCarticon().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			cart.getRemove().click();

		}
		@Test
		public void add_Address_006() {
			login_002();
			//TO ADD ADDRESS
			AccSettingsPage as=new AccSettingsPage(driver);
			as.getAddresss().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			AddressPage address=new AddressPage(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Actions mouse=new Actions(driver);
			mouse.moveToElement(address.getAddnewaddress()).perform();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			address.getAddnewaddress().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			address.getAddressfirstname().sendKeys("ROLEX");
			address.getAddaddresslastname().sendKeys("SIR");
			address.getCompanyname().sendKeys("SIMS HOSPITAL");
			address.getPhonenumber().sendKeys("9876543210");
			address.getAddress1().sendKeys("NO:1 JAWAHARLAL NEHRU STREET");
			address.getAddress2().sendKeys("VADAPALANI");
			address.getCity().sendKeys("CHENNAI");
			address.getPincode().sendKeys("600036");
			WebElement state=address.getState();
			Select s=new Select(state);
			s.selectByVisibleText("Kerala");
			address.getAddresssubmit().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			String Addressaftercount=address.getAddresscount().getText();
			System.out.println(Addressaftercount);	
		}
		@Test
		public void delete_Address_007() {
			login_002();
			AccSettingsPage as=new AccSettingsPage(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			as.getAddresss().click();
			AddressPage addresss=new AddressPage(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			addresss.getDelete().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			driver.switchTo().alert().accept();
		}
		
		@Test
		public void edit_Address_008() throws InterruptedException {
			login_002();
			AccSettingsPage as=new AccSettingsPage(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			as.getAddresss().click();
			AddressPage ed=new AddressPage(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			ed.getEdit().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			ed.getEditfirstname().clear();
			Thread.sleep(500);
			ed.getEditfirstname().sendKeys("MARK");
			Thread.sleep(2000);
			ed.getEditlastname().clear();
			ed.getEditlastname().sendKeys("ANTONY");
			ed.getEditcompany().clear();
			ed.getEditcompany().sendKeys("ZERO GRAVITY");
			ed.getEditaddress1().clear();
			ed.getEditaddress1().sendKeys("NO 36 JOISER STREET");
			ed.getEditaddress2().clear();
			ed.getEditaddress2().sendKeys("NUNGAMBAKKAM");
			ed.getEditcity().clear();
			ed.getEditcity().sendKeys("HYDERABAD");
			WebElement selectstate=ed.getEditstate();
			Select state=new Select(selectstate);
			state.selectByVisibleText("Telangana");
			ed.getUpdateaddressbtn().click();	
		}
		@Test
		public void default_Delivery_Address_009() {
			login_002();
			AccSettingsPage as=new AccSettingsPage(driver);
			as.getAddresss().click();
			AddressPage address=new AddressPage(driver);
			address.getAddnewaddress().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			address.getAddressfirstname().sendKeys("ROLEX");
			address.getAddaddresslastname().sendKeys("SIR");
			address.getCompanyname().sendKeys("SIMS HOSPITAL");
			address.getPhonenumber().sendKeys("9876543210");
			address.getAddress1().sendKeys("NO:1 JAWAHARLAL NEHRU STREET");
			address.getAddress2().sendKeys("VADAPALANI");
			address.getCity().sendKeys("CHENNAI");
			address.getPincode().sendKeys("600036");
			WebElement state=address.getState();
			Select s=new Select(state);
			s.selectByVisibleText("Kerala");
			address.getDefaultaddresscheckbox().click();
			address.getAddresssubmit().click();
			}
		@Test
		public void add_Multiple_Address_010() {
			login_002();
			AccSettingsPage as=new AccSettingsPage(driver);
			as.getAddresss().click();
			AddressPage address=new AddressPage(driver);
			address.getAddnewaddress().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			address.getAddressfirstname().sendKeys("ROLEX");
			address.getAddaddresslastname().sendKeys("SIR");
			address.getCompanyname().sendKeys("SIMS HOSPITAL");
			address.getPhonenumber().sendKeys("9876543210");
			address.getAddress1().sendKeys("NO:1 JAWAHARLAL NEHRU STREET");
			address.getAddress2().sendKeys("VADAPALANI");
			address.getCity().sendKeys("CHENNAI");
			address.getPincode().sendKeys("600036");
			WebElement state=address.getState();
			Select s=new Select(state);
			s.selectByVisibleText("Tamil Nadu");
			address.getAddresssubmit().click();
			}
		@Test
		public void compare_Two_product_011() {
			product_Search_003();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			ComparePage c=new ComparePage(driver);
			c.getComparecheckbox().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			c.getCompare1().click();
			c.getCompare2().click();
			c.getComparedrawer().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			c.getComparebtn().click();

		}
		@Test
		public void compare_More_Product_012() {
			product_Search_003();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			ComparePage c=new ComparePage(driver);
			c.getComparecheckbox().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			c.getCompare1().click();
			c.getCompare2().click();
			c.getCompare3().click();
			c.getComparedrawer().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			c.getComparebtn().click();
		}
		@Test
		public void compare_Product_Remove_013() {
			product_Search_003();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			ComparePage c=new ComparePage(driver);
			c.getComparecheckbox().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			c.getCompare1().click();
			c.getCompare2().click();
			c.getCompare3().click();
			c.getComparedrawer().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			c.getClearbtn().click();

		}
		@Test(groups= {"skipSetup"})
		public void addtocart_Without_Login_014() {
			HomePage h=new HomePage(driver);
			h.getSearchbar().sendKeys("helmet",Keys.ENTER);
			WelcomePage w=new WelcomePage(driver);
			Actions mouse=new Actions(driver);
			mouse.moveToElement(w.getSmkstellarhelmet()).perform();
			w.getSmkstellarhelmet().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			w.getSmktocart().click();
			
		}
		@Test(groups= {"skipSetup"})
		public void newsletter_Subscribe_015() {
			WelcomePage w=new WelcomePage(driver);
			Actions mouse=new Actions(driver);
			mouse.moveToElement(w.getNewsletter()).perform();
			w.getNewsletter().sendKeys("rolexsir123@gmail.com");
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			WebElement subscribebtn=w.getNewssubscribebtn();
			jse.executeScript("arguments[0].click()",subscribebtn);		
			}
		@Test
		public void review_Product_016() throws InterruptedException {
			HomePage h=new HomePage(driver);
			h.getSearchbar().sendKeys("helmet",Keys.ENTER);
			WelcomePage w=new WelcomePage(driver);
			Actions mouse=new Actions(driver);
			mouse.moveToElement(w.getSmkstellarhelmet()).perform();
			w.getSmkstellarhelmet().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			ReviewPage r=new ReviewPage(driver);
			r.getReviewbtn().click();
			r.getName().sendKeys("ROLEX");
			r.getMail().sendKeys("rolex123@gmail.com");
			r.getReviewtitle().click();
			r.getReviewtitle().sendKeys("PRODUCT CONFORT");
			r.getComments().sendKeys("build quality is super");
			Actions m=new Actions(driver);
			m.moveToElement(r.getReviewcheckbox()).perform();
			r.getReviewcheckbox().click();
			Thread.sleep(2000);    
			r.getSubmitreview().click();
		}
		@Test
		public void logout_017() {
			login_002();
			AccSettingsPage as=new AccSettingsPage(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			as.getLogoutbtn().click();
		}
		
   
}
