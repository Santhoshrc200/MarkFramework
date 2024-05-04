package PitshopObjRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewPage {
	public ReviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Write A Review")
	private WebElement reviewbtn;
	@FindBy(id = "username_id")
	private WebElement name;
	@FindBy(id = "email_id")
	private WebElement mail;
	@FindBy(id = "Capa_1")
	private WebElement starrating;
	@FindBy(id = "review_title_id")
	private WebElement reviewtitle;
	@FindBy(id = "review_comment_id")
	
	private WebElement comments;
	@FindBy(id = "recommend_product")
	private WebElement reviewcheckbox;
	@FindBy(xpath = "//button[.='Submit Review']")
	private WebElement submitreview;
	public WebElement getReviewbtn() {
		return reviewbtn;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getMail() {
		return mail;
	}
	public WebElement getStarrating() {
		return starrating;
	}
	public WebElement getReviewtitle() {
		return reviewtitle;
	}
	public WebElement getComments() {
		return comments;
	}
	public WebElement getReviewcheckbox() {
		return reviewcheckbox;
	}
	public WebElement getSubmitreview() {
		return submitreview;
	}
	

}
