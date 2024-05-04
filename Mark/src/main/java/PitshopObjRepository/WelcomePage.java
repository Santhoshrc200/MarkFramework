package PitshopObjRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[.='Log in']")
	private WebElement accountlink;
	public WebElement getAccountlink() {
		return accountlink;
	}
	@FindBy(linkText = "SMK Stellar Gloss Black Helmet")
	private WebElement smkstellarhelmet;
	@FindBy(xpath = "//button[.='Add to cart']")
	private WebElement smktocart;
	public WebElement getSmkstellarhelmet() {
		return smkstellarhelmet;
	}
	public WebElement getSmktocart() {
		return smktocart;
	}
	@FindBy(id="footer-signup")
	private WebElement newsletter;
	@FindBy(xpath = "//span[.='Subscribe']")
	private WebElement newssubscribebtn;
	public WebElement getNewsletter() {
		return newsletter;
	}
	public WebElement getNewssubscribebtn() {
		return newssubscribebtn;
	}
}
