package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import GeneralLibrary.BaseClass;
import ObjectRepository.ApparelPage;
import ObjectRepository.WelcomePage;

public class ApprarelsTest extends BaseClass {

	@Test
	public void apparel_001() {
		
		WelcomePage welcome=new WelcomePage(driver);
		ApparelPage apparels=new ApparelPage(driver);
		
		welcome.getApparelLink().click();
		
		test.log(LogStatus.INFO, "Clicked on apparels");
		
		Assert.assertEquals(apparels.getPageTitle().getText(),"Apparel & Shoes");
		
		test.log(LogStatus.PASS, "Apparels page is displayed");
		
		
	}
}
