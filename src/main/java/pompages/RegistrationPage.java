package pompages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;
 
public class RegistrationPage  extends BaseClass{
	
	
	@FindBy(xpath="//input[@placeholder='Your Name']")
	WebElement usernamefiled;
	
	@FindBy(xpath="//input[@placeholder='Your Email Id']")
	WebElement emailfiled;
	
	
	@FindBy(xpath="//input[@name='txtPassword']")
	WebElement passwordfiled;
	
	@FindBy(id="//input[@class='form-control iti__tel-input']")
	WebElement mobilefiled;
	
	@FindBy(xpath="//span[@id='recaptcha-anchor']")
	WebElement robotfiled;
	
	@FindBy(xpath="//label[text()='I accept ']")
	WebElement checkbox;
	
	@FindBy(id="btnSignUp")
	WebElement signUp;
	//button[@class ='confirm']
	
	@FindBy(xpath="//button[text() ='OK']")
	WebElement ok;
	
	
	
	public RegistrationPage() {
		
		PageFactory.initElements(driver, this);
	}

	public DashboardPage registrationPageCreation(String use, String emai,String pass) throws InterruptedException {
		usernamefiled.sendKeys(use);
		emailfiled.sendKeys(emai);
		passwordfiled.sendKeys(pass);
		mobilefiled.sendKeys("8904058620");
	//	mobilefiled.sendKeys("8904058620");
		Thread.sleep(20000);
//		robotfiled.click();
//		checkbox.click();
//		signUp.click();
		Thread.sleep(10000);
	//	Alert alert =driver.switchTo().alert();
	//	alert.accept();
		ok.click();
		Thread.sleep(5000);
		return new DashboardPage();
		
	}
	
}
