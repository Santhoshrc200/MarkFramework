package PitshopObjRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="header-search")
	private WebElement searchbar;
	public WebElement getSearchbar() {
		return searchbar;
	}
	@FindBy(linkText = "HELMETS AND ACCESSORIES")
	private WebElement helmetlink;
	public WebElement getHelmetlink() {
		return helmetlink;
	}
	@FindBy(linkText = "FULL FACE HELMET")
	private WebElement fullfacehelmetlink;
	public WebElement getFullfacehelmetlink() {
		return fullfacehelmetlink;
	}
}
