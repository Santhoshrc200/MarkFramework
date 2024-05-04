package PitshopObjRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComparePage {
	public ComparePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "compare-switch")
	private WebElement comparecheckbox;
	@FindBy(id = "compare-7954642272514")
	private WebElement compare1;
	@FindBy(id = "compare-6918818496691")
	private WebElement compare2;
	@FindBy(id ="compare-drawer-open")
	private WebElement comparedrawer;
	@FindBy(className = "//button[@class=\"btn btn--primary js-trigger-compare w-full\"]")
	private WebElement comparebtn;
	@FindBy(className = "//button[@class=\"link text-sm mt-4 text-current w-full js-clear-compare\"]")
	private WebElement clearbtn;
	@FindBy(id = "compare-7937473282306")
	private WebElement compare3;
	public WebElement getCompare3() {
		return compare3;
	}
	public WebElement getComparecheckbox() {
		return comparecheckbox;
	}
	public WebElement getCompare1() {
		return compare1;
	}
	public WebElement getCompare2() {
		return compare2;
	}
	public WebElement getComparedrawer() {
		return comparedrawer;
	}
	public WebElement getComparebtn() {
		return comparebtn;
	}
	public WebElement getClearbtn() {
		return clearbtn;
	}
	
}
