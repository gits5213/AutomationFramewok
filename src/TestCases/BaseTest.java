package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
public class BaseTest {
	public WebDriver driver;
	public static final String project_URL = "https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en";
	
	
	@Parameters("browser")
	@BeforeClass
	public void browserCofig(String browser){
		String basePath = System.getProperty("user.dir");

		if (browser.equalsIgnoreCase("chrome")){
			String chromePath = basePath + "\\lib\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromePath);
			driver = new ChromeDriver();
			System.out.println("Chrome Browser executing");
			
		}else if (browser.equalsIgnoreCase("firefox")){
			String fireFoxPath = basePath + "\\lib\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", fireFoxPath);
			driver = new FirefoxDriver();
			System.out.println("Firefox Browser executing");
			
		}else if (browser.equalsIgnoreCase("ie")){
			String iePath = basePath + "\\lib\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", iePath);
			driver = new InternetExplorerDriver();
			System.out.println("IE Browser executing");
		}
	}
	
	@BeforeMethod
	public void beforeMethod(){
	driver.get(project_URL);
	driver.manage().window().maximize();
	//open up the Firefox Browser
	System.out.println(driver.getCurrentUrl());
	driver.getTitle();
	}
	
	@AfterMethod
	public void afterTest(){
		System.out.println("Method is passing");
	}
	
	@AfterClass
	public void afterClass(){
		driver.quit();
		
	}
	
	public static void sleepTest(long sleeptime){
		try{Thread.sleep(sleeptime);
	}catch (Exception e){
		
		}	
	}	
}
