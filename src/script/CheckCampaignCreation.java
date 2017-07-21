package script;

import org.testng.annotations.Test;

import generic.AutoUtility;
import generic.BaseTest;
import generic.Excel;
import page.AddCampaignPage;
import page.LoginPage;
import page.ManageCampaignPage;
import page.NavigationPage;

public class CheckCampaignCreation extends BaseTest {
	@Test(priority=4)
	private void testCheckCampaignCreation() {
		String un = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 0);
		String pwd = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 1);
		String campName = Excel.getCellValue(INPUT_PATH, "CheckCampaignCreation", 1, 0);
		String allKey = Excel.getCellValue(INPUT_PATH, "CheckCampaignCreation", 1, 1);
		String anyKey = Excel.getCellValue(INPUT_PATH, "CheckCampaignCreation", 1, 2);
		//login to application
		LoginPage loginPage = new LoginPage(driver);
		loginPage.signInApp(un, pwd);
		//click on manage tab
		NavigationPage navPage = new NavigationPage(driver);
		navPage.clickManageTab();
		//click on new campaign
		ManageCampaignPage mcp = new ManageCampaignPage(driver);
		mcp.clickNewCampLNK();
		
		//Add campaign details and hit submit
		AddCampaignPage acp = new AddCampaignPage(driver);
		acp.setCampaignDetail(campName, allKey, anyKey);
		AutoUtility.sleep(3);
		mcp.clickDeleteAndCancel();
	}
}
