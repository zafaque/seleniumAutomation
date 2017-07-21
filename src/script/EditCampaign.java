package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.AddCampaignPage;
import page.LoginPage;
import page.ManageCampaignPage;
import page.NavigationPage;

public class EditCampaign extends BaseTest {
	@Test(priority=5)
	private void testEditCampaign() {
		String un = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 0);
		String pwd = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 1);
		String campNameEdited = Excel.getCellValue(INPUT_PATH, "CheckCampaignCreation", 1, 3);
		//login to application
		LoginPage loginPage = new LoginPage(driver);
		loginPage.signInApp(un, pwd);
		//click on manage tab
		NavigationPage navPage = new NavigationPage(driver);
		navPage.clickManageTab();
		//Hover on first campaign and click on edit icon
		ManageCampaignPage mcp = new ManageCampaignPage(driver);
		mcp.clickEditCampIcon();
		
		//Add campaign details and hit submit
		AddCampaignPage acp = new AddCampaignPage(driver);
		acp.editCampaignDetail(campNameEdited);
		
	}
}
