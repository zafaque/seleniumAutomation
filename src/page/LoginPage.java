package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.AutoUtility;
import generic.BasePage;

public class LoginPage extends BasePage {
	//Deceleration
	@FindBy(name="email_display")
	private WebElement usernameTxt;
	
	@FindBy(id="password_display")
	private WebElement passwordTxt;
	
	@FindBy(id="login_go")
	private WebElement loginBtn;
	
	@FindBy(id="forgot_password_link")
	private WebElement forgotPasswordLink;
	
	@FindBy(id="error_message")
	private WebElement errorMsg;

	//Initialization
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//Implementation
	public void setUsername(String un) {
		usernameTxt.clear();
		usernameTxt.sendKeys(un);
		log.info("Entering username: "+ un);
	}
	
	public void setPassword(String pwd) {
		passwordTxt.clear();
		passwordTxt.sendKeys(pwd);
		log.info("Entering username: "+ pwd);
	}
	
	public void clickLoginBtn() {
		log.info("Clicking login button");
		loginBtn.click();
	}
	
	public void clickForgotPasswordLink() {
		log.info("clicking forgot passwork link");
		forgotPasswordLink.click();
	}
	public void signInApp(String un, String pwd) {
		usernameTxt.sendKeys(un);
		log.info("Entering username: "+ un);
		passwordTxt.sendKeys(pwd);
		log.info("Entering password: "+ pwd);
		loginBtn.click();
	}
	public void verifyErrorMessageIsDisplayed() {
		log.info("Verify error message displayed");
		AutoUtility.sleep(2);
		veriyElementIsPresent(errorMsg);
	}
}
