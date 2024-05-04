package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "BOOKS")
	private WebElement bookslink;
	public WebElement getBookslink() {
		return bookslink;
	}
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	public WebElement getRegisterlink() {
		return registerlink;
	}
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	public WebElement getLoginlink() {
		return loginlink;
	}
	@FindBy(linkText = "Log out")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	@FindBy(linkText ="Apparel & Shoes")
	private WebElement apparelLink;
	public WebElement getApparelLink() {
		return apparelLink;
	}
	
	
	
	

}
