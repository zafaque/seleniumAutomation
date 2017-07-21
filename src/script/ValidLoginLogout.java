package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.HomePage;
import page.LoginPage;

public class ValidLoginLogout extends BaseTest {
	@Test(priority=1)
	public void testValidLoginLOgout() {
		String username = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 0);
		String password = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 1);
		String homePageTitle = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 2);
		String loginPageTitle = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 3);
		
		//Enter user name
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername(username);
		//Enter password
		loginPage.setPassword(password);
		//Click on login
		loginPage.clickLoginBtn();
		//Verify home page is displayed (Meltwater Buzz - Set Active Company / Meltwater Buzz - Overview)
		HomePage homePage = new HomePage(driver);
		homePage.verifyTitle(homePageTitle);
		//Click on logout
		homePage.clickLogout();
		//verify `login page is displayed ( Meltwater Buzz - Login)
		loginPage.verifyTitle(loginPageTitle);
	}
}
