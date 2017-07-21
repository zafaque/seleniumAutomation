package generic;

public interface IAutoConst {
	String CHROME_KEY = "webdriver.chrome.driver";
	String CHROME_VALUE = "./driver/chromedriver.exe";
	
	String GECKO_KEY = "webdriver.gecko.driver";
	String GECKO_VALUE = "./driver/geckodriver.exe";
	
	String IE_KEY = "webdriver.ie.driver";
	String IE_VALUE = "./driver/IEDriverServer.exe";
	
	String EDGE_KEY = "webdriver.edge.driver";
	String EDGE_VALUE = "./driver/MicrosoftWebDriver.exe";
	
	String SCREENSHOT_PATH = "./screenshot/";
	String INPUT_PATH = "./data/input.xlsx";
	String CONFIG_PATH = "./config.properties";
	
	/*all the variables in interface are by default 
	 * public static final
	 */
	
}
