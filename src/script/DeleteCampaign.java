package script;

import org.testng.annotations.Test;

import generic.AutoUtility;
import generic.BaseTest;
import generic.Excel;
import page.LoginPage;
import page.ManageCampaignPage;
import page.NavigationPage;

public class DeleteCampaign extends BaseTest{
	@Test(priority=6)
	public void testDeleteCampaign() {
		String un = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 0);
		String pwd = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 1);		
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.signInApp(un, pwd);
		//click on manage tab
		NavigationPage navPage = new NavigationPage(driver);
		navPage.clickManageTab();
		AutoUtility.sleep(2);
		ManageCampaignPage mcp = new ManageCampaignPage(driver);
		mcp.clickDeleteCampIcon();
	}
}
