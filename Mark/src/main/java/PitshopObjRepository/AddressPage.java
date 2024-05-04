package PitshopObjRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class=\"form-width mt-12 mx-auto text-center\"]//button[contains(@class,\" js-add-address\")]")
	private WebElement addnewaddress;
	@FindBy(id = "add-address-first-name")
	private WebElement addressfirstname;
	@FindBy(id = "add-address-last-name")
	private WebElement addaddresslastname;
	@FindBy(id = "add-address-company")
	private WebElement companyname;
	@FindBy(id = "add-address-phone")
	private WebElement phonenumber;
	@FindBy(id = "add-address-address1")
	private WebElement address1;
	@FindBy(id ="add-address-address2")
	private WebElement address2;
	@FindBy(id = "add-address-city")
	private WebElement city;
	@FindBy(id = "add-address-zip")
	private WebElement pincode;
	@FindBy(id="add-address-country")
	private WebElement country;
	@FindBy(id = "add-address-province")
	private WebElement state;
	@FindBy(id = "address_default_address_new")
	private WebElement defaultaddresscheckbox;
	@FindBy(xpath= "//button[.='Add address']")
	private WebElement addresssubmit;
	@FindBy(xpath = "//span[@class='badge shrink-0 text-center']")
	private WebElement addresscount;
	@FindBy(xpath = "//button[.='Delete']")
	private WebElement delete;
	@FindBy(xpath = "//button[.='Edit']")
	private WebElement edit;
	@FindBy(id = "edit-9058813706498-first-name")
	private WebElement editfirstname;
	@FindBy(id = "edit-9058813706498-last-name")
	private WebElement editlastname;
	@FindBy(id ="edit-9058813706498-company")
	private WebElement editcompany;
	@FindBy(id = "edit-9058813706498-phone")
	private WebElement editphonenumber;
	@FindBy(id = "edit-9058813706498-address1")
	private WebElement editaddress1;
	@FindBy(id = "edit-9058813706498-address2")
	private WebElement editaddress2;
	@FindBy(id = "edit-9058813706498-city")
	private WebElement editcity;
	@FindBy(id = "edit-9058813706498-zip")
	private WebElement editpincode;
	@FindBy(id = "edit-9058813706498-country")
	private WebElement editcountry;
	@FindBy(id = "edit-9058813706498-province")
	private WebElement editstate;
	@FindBy(xpath= "//button[.='Update address']")
	private WebElement updateaddressbtn;
	public WebElement getEditcompany() {
		return editcompany;
	}
	public WebElement getEditphonenumber() {
		return editphonenumber;
	}
	public WebElement getEditaddress1() {
		return editaddress1;
	}
	public WebElement getEditaddress2() {
		return editaddress2;
	}
	public WebElement getEditcity() {
		return editcity;
	}
	public WebElement getEditpincode() {
		return editpincode;
	}
	public WebElement getEditcountry() {
		return editcountry;
	}
	public WebElement getEditstate() {
		return editstate;
	}
	public WebElement getUpdateaddressbtn() {
		return updateaddressbtn;
	}
	public WebElement getEditfirstname() {
		return editfirstname;
	}
	public WebElement getEditlastname() {
		return editlastname;
	}
	public WebElement getEdit() {
		return edit;
	}
	public WebElement getDelete() {
		return delete;
	}
	public WebElement getAddresscount() {
		return addresscount;
	}
	public WebElement getAddress1() {
		return address1;
	}
	public WebElement getAddress2() {
		return address2;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getDefaultaddresscheckbox() {
		return defaultaddresscheckbox;
	}
	public WebElement getAddresssubmit() {
		return addresssubmit;
	}
	public WebElement getAddnewaddress() {
		return addnewaddress;
	}
	public WebElement getAddressfirstname() {
		return addressfirstname;
	}
	public WebElement getAddaddresslastname() {
		return addaddresslastname;
	}
	public WebElement getCompanyname() {
		return companyname;
	}
	public WebElement getPhonenumber() {
		return phonenumber;
	}

}
