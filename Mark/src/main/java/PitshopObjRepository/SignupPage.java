package PitshopObjRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "customer[first_name]")
	private WebElement firstname;
	@FindBy(id = "register-last-name")
	private WebElement lastname;
	@FindBy(id="register-email")
	private WebElement email;
	@FindBy(id = "register-password")
	private WebElement password;
	@FindBy(xpath = "//button[.='Create account']")
	private WebElement createaccountbutton;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getCreateaccountbutton() {
		return createaccountbutton;
	}

}
