package pompages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.BaseClass;

public class AgentPage extends BaseClass{

	@FindBy(xpath="//input[@placeholder='Enter name']")
	WebElement enterName;
	
	@FindBy(xpath="//input[@placeholder='Enter mobile no.']")
	WebElement mobileNo;
	
	@FindBy(xpath="//input[@placeholder='Enter email']")
	WebElement enterEmail;
	
	@FindBy(xpath="//input[@placeholder='Enter password']")
	WebElement password;
	
	@FindBy(xpath="//select[@id='ContentPlaceHolder1_ddl_lead']")
	WebElement select;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//p[text()='Agent Added Successfully!']")
	WebElement successfully;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement ok;
	
public  AgentPage() {
		
		PageFactory.initElements(driver, this);
	}
public void AddAgent() throws InterruptedException {
	
	enterName.sendKeys("resore");
	mobileNo.sendKeys("638620");
	enterEmail.sendKeys("basappa@gmail.com");
	password.sendKeys("No@123");
	select.click();
	Thread.sleep(3000);
	submit.click();
	//String message= successfully.getText();
	//ok.click();
	
}
public String verifyAgentAdd() {
	//Alert alert =driver.switchTo().alert();
	//String message= alert.getText();
	String message= successfully.getText();
	Assert.assertEquals("Agent Added Successfully!", message);
	return message;
	//ok.click();
}
public void ok() {
	ok.click();
}
	
}
