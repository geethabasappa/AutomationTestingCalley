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
	
	@FindBy(xpath="//input[@class='form-control iti__tel-input']")
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
	
	@FindBy(xpath="//a[@id='ancPop2']")
	WebElement freeTrial;
	
	@FindBy(xpath="//inpu[type='submit']")
	WebElement submitForFree;	
	
	
	
	public RegistrationPage() {
		
		PageFactory.initElements(driver, this);
	}

	public DashboardPage registrationPageCreation() throws InterruptedException {
		usernamefiled.sendKeys("Renu");
		emailfiled.sendKeys("renu@gmail.com");
		passwordfiled.sendKeys("Renu@123");
		mobilefiled.sendKeys("8904058620");
	//	mobilefiled.sendKeys("8904058620");
		Thread.sleep(20000);
//		robotfiled.click();
//		checkbox.click();
		signUp.click();
		Thread.sleep(10000);
	//	Alert alert =driver.switchTo().alert();
	//	alert.accept();
		ok.click();
		Thread.sleep(8000);
		return new DashboardPage();
		
	}
	public void freeTrialCall() throws InterruptedException {
		Thread.sleep(4000);
		freeTrial.click();
		submitForFree.click();
	}
	
}
