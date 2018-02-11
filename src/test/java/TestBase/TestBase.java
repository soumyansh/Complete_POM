package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Pages.TopMenu;
import Utilities.ExcelReader;

public class TestBase {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static FileInputStream fis1;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\Excel\\TestData.xlsx");
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static TopMenu menu;

	@BeforeSuite
	public void setup() throws IOException {
		if (extent == null) {
			extent = new ExtentReports(System.getProperty("user.dir") + "//src//test//Reports//ExtentReports.html",
					true);
			extent.loadConfig(new File(System.getProperty("user.dir") + "//src//test//Reports//ReportsConfig.xml"));
		}
		if (driver == null) {

			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\Config.properties");
			fis1 = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Properties\\OR.properties");
			config.load(fis);
			OR.load(fis1);
			log.info("config file loaded");
			if (config.getProperty("browser").equals("mozilla")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\Executables\\geckodriver.exe");

				FirefoxProfile ffprofile = new FirefoxProfile();
				ffprofile.setPreference("dom.webnotifications.enabled", false);
				driver = new FirefoxDriver(ffprofile);

				log.debug("Mozilla launched");
			} else if (config.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\Executables\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.get(config.getProperty("URL"));
			log.debug("navigated to URL...");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			menu = new TopMenu();
		}
	}

	public boolean isElementPresent(String locator) {
		if (driver.findElement(By.xpath(locator)).isDisplayed()) {
			return true;
		} else
			return false;

	}

	@AfterSuite
	public void tearDown() {

		log.debug("Execution Completed");
		// driver.quit();

	}

}
