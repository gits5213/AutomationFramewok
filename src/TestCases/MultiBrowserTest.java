package TestCases;

import org.testng.annotations.Test;
import TestPages.GoogleRegistrationPage;

public class MultiBrowserTest extends BaseTest {

	@Test
	public void multiBrowser(){
				
		GoogleRegistrationPage grp = new GoogleRegistrationPage(driver);
		grp.getfirstName().sendKeys("Alamin");
		grp.getlastName().sendKeys("Shorker");
		grp.getgmailAddre().sendKeys("Shorker.shorker123");
		grp.getpassWord().sendKeys("Shahnewaz1");
		grp.getpassWordAgain().sendKeys("Shahnewaz1");
		
		
		grp.getbirthDay().sendKeys("Shahnewaz1");
		grp.getbirthYear().sendKeys("Shahnewaz1");
		
		
		grp.getrecoveryPhone().sendKeys("Shahnewaz1");
		grp.getrecoveryEmail().sendKeys("Shahnewaz1");
		
		if(grp.getNextBtn().isEnabled()){System.out.println("Next button is visible!");
		}else{System.out.println("Next button is not visible!");};
		
	}

}


		
		/*String basePath = System.getProperty("user.dir");
		String chromePath = basePath + "\\lib\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver = new ChromeDriver();*/
		
		/*driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();*/

		/*driver.findElement(By.cssSelector("a.gb_P")).click();  //tag.class
		driver.findElement(By.xpath("//a[contains(.,'Create an account')]")).click();
					
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));*/
		
		/*//driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Alamin");  //tag and ID
		//driver.findElement(By.cssSelector("input#LastName")).sendKeys("Shorker");	//tag and ID
		//driver.findElement(By.cssSelector("input#GmailAddress")).sendKeys("Shorker.shorker123");	//tag and ID
		//driver.findElement(By.cssSelector("input#Passwd")).sendKeys("Shahnewaz1");	//tag and ID
		//driver.findElement(By.cssSelector("input#PasswdAgain")).sendKeys("Shahnewaz1");	//tag and ID
*/
		//driver.findElement(By.cssSelector("#BirthMonth > div:nth-child(1) > div:nth-child(2)")).click();
		//driver.findElement(By.id(":6")).click();

		/*driver.findElement(By.cssSelector("input#BirthDay")).sendKeys("16");	//tag and ID
		driver.findElement(By.cssSelector("input#BirthYear")).sendKeys("1980");	//tag and ID 
*/
		//driver.findElement(By.cssSelector("#Gender > div:nth-child(1)")).click();
		//driver.findElement(By.id(":f")).click();
		
		/*driver.findElement(By.cssSelector("input#RecoveryPhoneNumber")).sendKeys("19175616554");
		driver.findElement(By.cssSelector("input#RecoveryEmailAddress")).sendKeys("helloaaaa@gmail.com");*/
		
		//driver.findElement(By.id(":i")).click();
		//driver.findElement(By.id(":7d")).click();
		
		/*WebElement NextBtn = driver.findElement(By.cssSelector("input#submitbutton"));*/
		
		/*if(NextBtn.isEnabled()){
			System.out.println("Next button is visible!");
		}else{
			System.out.println("Next button is not visible!");
		};*/
		
		/*driver.close();
	    driver.switchTo().window(tabs2.get(0));
	    
	    WebElement CreateAccountLink = driver.findElement(By.xpath("//a[contains(.,'Create an account')]"));
	    if(CreateAccountLink.isDisplayed()){
	    	System.out.println("driver is switch to previous page");
	    }else{
	    	System.out.println("driver is on the current page");
	    }*/

