package demo.GithubRegistration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class RegistrationPage {
	@FindBy(id="user[login]")
	WebElement username;

	@FindBy(id="user[password]")
	WebElement password;
	
	@FindBy(id="user[email]")
	WebElement emailid;

	@FindBy(className="btn")
	WebElement button;


	public RegistrationPage(){}

	public void setUsername(String username) {
		this.username.sendKeys(username);
	}
	public WebElement getUsername() {
		return username;
	}
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	public WebElement getPassword() {
		return password;
	}
	public void setEmailID(String emailid) {
		this.emailid.sendKeys(emailid);
	}
	public WebElement getEmailID() {
		return emailid;
	}
	public void clickSubmitButton() {
		button.submit();
	}
	
}
