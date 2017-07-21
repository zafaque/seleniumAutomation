package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.BasePage;

public class NavigationPage extends BasePage {
	@FindBy(xpath="//a[.='Home']")
	private WebElement homeTab;
	@FindBy(xpath="//a[.='Listen']")
	private WebElement listenTab;
	@FindBy(xpath="//a[.='Report']")
	private WebElement reportTab;
	@FindBy(xpath="//a[.='Manage']")
	private WebElement manageTab;
	@FindBy(xpath="//li[@id='analysis_menu']/a")
	private WebElement listenAnalysisTab;
	@FindBy(xpath="//a[.='Compare']")
	private WebElement listenAnalysisCompareTab;
	
	
	public NavigationPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickHomeTab() {
		log.info("Home tab is clicked");
		homeTab.click();
	}
	public void clickListenTab() {
		log.info("Listen tab is clicked");
		listenTab.click();
	}
	public void clickReportTab() {
		log.info("Report tab is clicked");
		reportTab.click();
	}
	public void clickManageTab() {
		log.info("Manage tab is clicked");
		manageTab.click();
	}
	
}
