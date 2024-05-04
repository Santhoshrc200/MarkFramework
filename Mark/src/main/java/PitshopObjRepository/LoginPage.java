package PitshopObjRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[.='Create an account']")
	private WebElement createaccountlink;
	@FindBy(id = "customer-email")
	private WebElement email;
	@FindBy(id = "customer-password")
	private WebElement pass;
	@FindBy(xpath = "//button[.='Sign in']")
	private WebElement signbtn;
	public WebElement getCreateaccountlink() {
		return createaccountlink;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSignbtn() {
		return signbtn;
	}
}
