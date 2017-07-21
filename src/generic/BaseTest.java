package generic;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
@Listeners(FWListener.class)
public class BaseTest implements IAutoConst {
	public WebDriver driver;
	public String strURL;
	public long lngITO;
	public Logger log = Logger.getLogger(this.getClass());
	public String username = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 0);
	public String password = Excel.getCellValue(INPUT_PATH, "ValidLoginLogout", 1, 1);
	@BeforeSuite
	public void initFramework(){
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(IE_KEY, IE_VALUE);
		System.setProperty(EDGE_KEY, EDGE_VALUE);
	}
	@Parameters("browser")
	@BeforeMethod
	public void openApp(@Optional("edge") String browser){
		if(browser.equals("chrome")){
			driver = new ChromeDriver();
			log.info("Opening Chrome Browser");
		}else{
			driver = new EdgeDriver();
			log.info("Opening Edge Browser");
		}
		strURL = AutoUtility.getPropertyValue(CONFIG_PATH, "URL");
		driver.get(strURL);
		driver.manage().window().maximize();
		log.info("Enter the URL: "+strURL);
		String sITO = AutoUtility.getPropertyValue(CONFIG_PATH, "ITO");
		log.info("Set implicitwait: "+ sITO);
		lngITO = Long.parseLong(sITO);
		driver.manage().timeouts().implicitlyWait(lngITO, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp(){
		driver.close();
		log.info("Close the browser");
	}
}
