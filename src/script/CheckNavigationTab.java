package script;

import org.testng.annotations.Test;

import generic.AutoUtility;
import generic.BaseTest;
import generic.Excel;
import page.LoginPage;
import page.NavigationPage;

public class CheckNavigationTab extends BaseTest {
	@Test(priority=3, enabled=false)
	public void testCheckNavigationTab() {
		String un = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 0);
		String pwd = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 1);
		String listenPageTitle = Excel.getCellValue(INPUT_PATH, "CheckNavigationTab", 1, 4);
		String reportPageTitle = Excel.getCellValue(INPUT_PATH, "CheckNavigationTab", 1, 5);
		String managePageTitle = Excel.getCellValue(INPUT_PATH, "CheckNavigationTab", 1, 6);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.signInApp(un, pwd);
		AutoUtility.sleep(2);
		NavigationPage navPage = new NavigationPage(driver);
		navPage.clickListenTab();
		navPage.verifyTitle(listenPageTitle);
		AutoUtility.sleep(2);

		navPage.clickReportTab();
		navPage.verifyTitle(reportPageTitle);
		AutoUtility.sleep(2);

		navPage.clickManageTab();
		navPage.verifyTitle(managePageTitle);
		
		navPage.clickLogout();
	}
}
