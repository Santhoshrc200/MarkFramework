package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "gender-male")
	private WebElement male;
	@FindBy(id = "FirstName")
	private WebElement firstnametxt;
	@FindBy(id = "LastName")
	private WebElement lastnametxt;
	@FindBy(id = "Email")
	private WebElement emailtxt;
	@FindBy(id = "Password")
	private WebElement passwordtxt;
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmElementtxt;
	@FindBy(id = "register-button")
	private WebElement registerbtn;
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	public WebElement getLoginlink() {
		return loginlink;
	}
	public WebElement getMale() {
		return male;
	}
	public WebElement getFirstnametxt() {
		return firstnametxt;
	}
	public WebElement getLastnametxt() {
		return lastnametxt;
	}
	public WebElement getEmailtxt() {
		return emailtxt;
	}
	public WebElement getPasswordtxt() {
		return passwordtxt;
	}
	public WebElement getConfirmElementtxt() {
		return confirmElementtxt;
	}
	public WebElement getRegisterbtn() {
		return registerbtn;
	}

}
