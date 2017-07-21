package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import generic.AutoUtility;
import generic.BasePage;

public class ManageCampaignPage extends BasePage {

	@FindBy(xpath="//div[@class='new_campaign_button']/a")
	private WebElement newCampaignLNK;
	
	@FindBy(xpath="//div[@id='main']//ul")
	private WebElement campaingLST;
	
	@FindBy(xpath="//div[@id='main']//ul/li[1]")
	private WebElement firstCampaign;
	
	@FindBy(xpath="//div[@id='main']//ul/li[1]//i[@data-tooltip='Delete Campaign']")
	private WebElement deleteCampIcon;
	
	@FindBy(xpath="//div[@id='main']//ul/li[1]//i[@data-tooltip='Edit Campaign']")
	private WebElement editCampIcon;
	
	public ManageCampaignPage(WebDriver driver) {
		super(driver);
	}

	public void clickNewCampLNK() {
		log.info("Clicked on new campaign link");
		newCampaignLNK.click();
	}
	
	public void clickDeleteAndCancel() {
		actions = new Actions(driver);
		actions.moveToElement(firstCampaign).perform();
		log.info("move to first element");
		deleteCampIcon.click();
		log.info("Click on delete campaign Icon");
		AutoUtility.sleep(2);
		driver.switchTo().alert().dismiss();
		log.info("Dismiss pop up");
	}
	
	public void clickDeleteCampIcon() {
		actions = new Actions(driver);
		actions.moveToElement(firstCampaign).perform();
		log.info("move to first element");
		deleteCampIcon.click();
		log.info("Click on delete campaign Icon");
		AutoUtility.sleep(2);
		driver.switchTo().alert().accept();
		log.info("Accept pop up, campaign deleted");
	}
	
	public void clickEditCampIcon() {
		actions = new Actions(driver);
		actions.moveToElement(firstCampaign).perform();
		log.info("move to first element");
		editCampIcon.click();
	}
}
