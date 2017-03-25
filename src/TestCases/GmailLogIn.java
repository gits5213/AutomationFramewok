package TestCases;
import java.io.IOException;

import org.testng.annotations.Test;

import Global.Data_Provider;
import TestCases.BaseTest;
import TestPages.GoogleLandingPage;
import TestPages.PasswordPage;
import TestPages.SignInGoogleAccountPage;
public class GmailLogIn extends BaseTest {
	public static final String pass="01715479713";
	
	@Test(dataProviderClass = Data_Provider.class, dataProvider="LogInTest")
	public void logIn(String username) throws IOException{

		GoogleLandingPage googleLandingpage = new GoogleLandingPage(driver);
		googleLandingpage.getsignInButton().click();
		sleepTest(1000);
		
		SignInGoogleAccountPage signAccountPage = new SignInGoogleAccountPage(driver);
		signAccountPage.getuserName().sendKeys(username);
		sleepTest(1000);

		signAccountPage.getnextButton().click();
		sleepTest(1000);
		
		PasswordPage passwordPage = new PasswordPage(driver);
		passwordPage.getpassWord().sendKeys(pass);
		passwordPage.getsignInButton().click();
		sleepTest(500);
		
		
		

	} 
	/*@Test
	public void logout(){
		System.out.println("system logged out");
	}*/
}
