package PitshopObjRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccSettingsPage {
	public AccSettingsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[.='Account']")
	private WebElement profileicon;
	@FindBy(linkText = "ADDRESSES")
	private WebElement addresss;
	public WebElement getProfileicon() {
		return profileicon;
	}
	public WebElement getAddresss() {
		return addresss;
	}
	@FindBy(xpath="//a[.='Log out']")
	private WebElement logoutbtn;
	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

}
