package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.BasePage;

public class AddCampaignPage extends BasePage {

	@FindBy(id="campaignName")
	private WebElement campaignNameTXT;
	
	@FindBy(id="allWords")
	private WebElement allWordsTXT;
	
	@FindBy(id="anyWords")
	private WebElement anyWordsTXT;
	
	@FindBy(id="noneWords")
	private WebElement noneWordsTXT;
	
	@FindBy(xpath="//input[@value='Preview']")
	private WebElement previewBTN;
	
	@FindBy(name="close")
	private WebElement closeBTN;
	
	@FindBy(id="open_refine")
	private WebElement filterResult;
	
	@FindBy(id="advance_search")
	private WebElement advanceSearchTXT;
	
	@FindBy(id="language")
	private WebElement selectLangDropDown;
	
	@FindBy(xpath="//span[@id='ui-dialog-title-sampleDataPopup']/..//a")
	private WebElement previewPopupClose;
	
	@FindBy(name="submit")
	private WebElement submitBtn;
	
	public AddCampaignPage(WebDriver driver) {
		super(driver);
	}
	
	public void setCampaignDetail(String campName, String allKey, String anyKey) {
		campaignNameTXT.sendKeys(campName);
		log.info("Entered Campaign name: "+ campName);
		allWordsTXT.sendKeys(allKey);
		log.info("All word entered are: "+ allKey);
		anyWordsTXT.sendKeys(anyKey);
		log.info("Any word entered are: "+ anyKey);
		previewBTN.click();
		log.info("Preview Button clicked");
		previewPopupClose.click();
		log.info("pop up closed");
		submitBtn.click();
		driver.switchTo().alert().accept();
		
	}
	public void editCampaignDetail(String campNameEdited) {
		campaignNameTXT.clear();
		campaignNameTXT.sendKeys(campNameEdited);
		log.info("Edited Campaign name: "+ campNameEdited);
		previewBTN.click();
		log.info("Preview Button clicked");
		previewPopupClose.click();
		log.info("pop up closed");
		submitBtn.click();
		driver.switchTo().alert().accept();
	}
}
