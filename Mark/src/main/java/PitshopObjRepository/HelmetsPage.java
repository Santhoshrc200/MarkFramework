package PitshopObjRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelmetsPage {
	
	
	public  HelmetsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "AXOR APEX TURBINE BLACK RED GREY")
	private WebElement axorhemet;
	public WebElement getAxorhemet() {
		return axorhemet;
	}
	@FindBy(xpath = "//button[.='Add to cart']")
	private WebElement axoraddtocart;
	public WebElement getAxoraddtocart() {
		return axoraddtocart;
	}

}
