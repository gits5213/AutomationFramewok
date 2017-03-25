package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleRegistrationPage extends BasePage {
	
	
	public GoogleRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="input#FirstName")
	private WebElement firstName;
	
	@FindBy(css="input#LastName")
	private WebElement lastName;
	
	@FindBy(css="input#GmailAddress")
	private WebElement gmailAddre;
	
	@FindBy(css="input#Passwd")
	private WebElement passWord;
	
	@FindBy(css="input#PasswdAgain")
	private WebElement passWordAgain;
	
	@FindBy(css="input#BirthDay")
	private WebElement birthDay;
	
	@FindBy(css="input#BirthYear")
	private WebElement birthYear;
	
	@FindBy(css="input#RecoveryPhoneNumber")
	private WebElement recoveryPhone;
	
	@FindBy(css="input#RecoveryEmailAddress")
	private WebElement recoveryEmail;
	
	@FindBy(css="input#submitbutton")
	private WebElement NextBtn;
	
	
	public WebElement getfirstName(){
		return firstName;
	}
	public WebElement getlastName(){
		return lastName;
	}
	public WebElement getgmailAddre(){
		return gmailAddre;
	}
	public WebElement getpassWord(){
		return passWord;
	}
	public WebElement getpassWordAgain(){
		return passWordAgain;
	}
	public WebElement getbirthDay(){
		return birthDay;
	}
	public WebElement getbirthYear(){
		return birthYear;
	}
	public WebElement getrecoveryPhone(){
		return recoveryPhone;
	}
	public WebElement getrecoveryEmail(){
		return recoveryEmail;
	}
	public WebElement getNextBtn(){
		return NextBtn;
	}

}
