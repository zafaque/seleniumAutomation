package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import generic.BasePage;

public class HomePage extends BasePage {
	@FindBy(id="btn_view_all_results")
	private WebElement viewAllLNK;
	
	@FindBy(xpath="//ul[@class='content_list']")
	private List<WebElement> searchResults;
	
	@FindBy(id="buzzvolume_chart")
	private WebElement buzzVolumeChart;
	
	@FindBy(id="pie_media_type_total_mentions")
	private WebElement buzzMediaGraph;
	
	@FindBy(id="tagCloud")
	private WebElement buzzTagCloud;
	
	@FindBy(xpath="//div[@id='div_dashboard_filter']//span")
	private WebElement dashboardFilter;
	
	@FindBy(xpath="//div[@class='campaign_list_scroller']/div")
	private List<WebElement> campaignDropDownLST;
	
	@FindBy(xpath="//a[.='Listen']")
	private WebElement listenTab;
	
	@FindBy(xpath="//a[.='Report']")
	private WebElement reportTab;
	
	@FindBy(xpath="//a[.='Manage']")
	private WebElement manageTab;
	
	@FindBy(xpath="//a[.='Home']")
	private WebElement HomeTab;
	
	@FindBy(xpath="(//ul[@class='content_list'])/li[1]")
	private WebElement firstSearchResult;
	
	@FindBy(xpath="(//ul[@class='content_list'])/li[1]//i[@class='icon-hand-right']")
	private WebElement neutralIcon;
	
	@FindBy(xpath="(//ul[@class='content_list'])/li[1]//i[@class='icon-thumbs-up']")
	private WebElement positiveIcon;
	
	@FindBy(xpath="(//ul[@class='content_list'])/li[1]//i[@class='icon-thumbs-down']")
	private WebElement negativeIcon;
	
	@FindBy(xpath="(//ul[@class='content_list'])/li[1]//i[@title='Remember']")
	private WebElement rememberIcon;
	
	@FindBy(xpath="(//ul[@class='content_list'])/li[1]//i[@title='Assign']")
	private WebElement assignTaskIcon;
	
	@FindBy(xpath="(//ul[@class='content_list'])/li[1]//i[@class='icon-more']")
	private WebElement moreIcon;
	
	@FindBy(xpath="(//ul[@class='content_list'])/li")
	private WebElement allSearchResult;
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void switchCampign() {
		dashboardFilter.click();
		log.info("Click on campaign dropdown icon");
		int count = campaignDropDownLST.size();
		log.info("The total count is: "+count);
		/*for(int i=0; i<count; i++){
			campaignDropDownLST.get(i).click();
		}*/
		for(WebElement e:campaignDropDownLST){
			e.click();
			
		}
	}
	



	
	
}
