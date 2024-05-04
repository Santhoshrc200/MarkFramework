package PitshopObjRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartSectionPage {
	public CartSectionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "cart-icon")
	private WebElement carticon;
	public WebElement getCarticon() {
		return carticon;
	}
	public WebElement getRemove() {
		return remove;
	}
	@FindBy(xpath = "//a[@data-index=\"1\"]")
	private WebElement remove;

}
