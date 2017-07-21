package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import page.HomePage;
import page.LoginPage;

public class SwitchCampaign extends BaseTest {
	@Test(priority=7, groups={"testing"})
	public void testSwitchCampaign() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.signInApp(username, password);
		HomePage homePage = new HomePage(driver);
		homePage.switchCampign();
	}
}
