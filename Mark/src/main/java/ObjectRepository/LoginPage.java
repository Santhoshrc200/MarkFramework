package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Email")
	private WebElement emailTF;
	@FindBy(id = "Password")
	private WebElement passTF;
	@FindBy(className = "login-button")
	private WebElement loginbtn;
	public WebElement getEmailTF() {
		return emailTF;
	}
	public WebElement getPassTF() {
		return passTF;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
