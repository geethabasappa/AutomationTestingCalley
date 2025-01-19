package pompages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.BaseClass;

public class LoginPage  extends BaseClass{
	@FindBy(id="txtEmailId")
	WebElement email;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogIn")
	WebElement login;
	
	
	@FindBy(xpath="//h4//span[text()='Hi Geetha']")
	WebElement username;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	public void verifylongin() {
		
	}

	public DashboardPage longinTo(String emailid,String pass ) {
		email.sendKeys(emailid);
		password.sendKeys(pass);
		login.click();
		return new DashboardPage();
		
	}
	

}
