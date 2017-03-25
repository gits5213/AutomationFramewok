package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordPage extends BasePage {
	
	public PasswordPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[contains(@name,'Passwd')]")
	public WebElement passWord;
	
	@FindBy(xpath="//input[contains(@id,'signIn')]")
	public WebElement signInButton;
	
	public WebElement getpassWord(){
		return passWord;
	}
	
	public WebElement getsignInButton(){
		return signInButton;
	}
	
	
	
	
	

}
