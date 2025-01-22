package pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class NewPage extends BaseClass{
	@FindBy(xpath="//input[@placeholder='Your Email Address']")
	WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Your Password']")
	WebElement password;
	
	@FindBy(id="btnLogIn")
	WebElement login;
	
	
	@FindBy(xpath="//h4//span[text()='Hi Geetha']")
	WebElement username;
	

	@FindBy(xpath="//h4//span[text()='Hi Geetha']")
	WebElement usernameindash;
	
	@FindBy(xpath="//span[text()='Team']")
	WebElement team;
	
	@FindBy(xpath="//span[text()='Agents']")
	WebElement agents;
	
	@FindBy(xpath="//span[text()='Call List ']")
	WebElement call;
	
	@FindBy(xpath="//span[contains(text(),'Add - Power Import')]")
	WebElement Add;
	
	
	
	//
	
	@FindBy(xpath="//input[@placeholder='Enter name']")
	WebElement enterName;
	
	@FindBy(xpath="//input[@placeholder='Enter mobile no.']")
	WebElement mobileNo;
	
	@FindBy(xpath="//input[@placeholder='Enter email']")
	WebElement enterEmail;
	
	@FindBy(xpath="//input[@placeholder='Enter password']")
	WebElement passwordInAgent;
	
	@FindBy(xpath="//select[@id='ContentPlaceHolder1_ddl_lead']")
	WebElement select;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//p[text()='Agent Added Successfully!']")
	WebElement successfully;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement ok;
	
	
	
	
	@FindBy(xpath="//input[@placeholder='List Name']")
	WebElement name;
	
	@FindBy(xpath="//button[@type='button']")////button[@title='Please select an agent']
	WebElement selectForCall;
	
	@FindBy(xpath="//input[@value='all']")
	WebElement all;
	
	@FindBy(xpath="//input[@type='file']")
	WebElement file;
	////p[@id='btnUp']
	
	@FindBy(xpath="//p[@class='btn btn-new2']")
	WebElement btn;
	
	@FindBy(xpath="//button[text()='Ok']")
	WebElement okInCall;
	
	@FindBy(xpath="//a[@id='ancPop2']")
	WebElement freeTrial;
	
	@FindBy(xpath="//inpu[type='submit']")
	WebElement submitForFree;	
	
	
	
	public NewPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public DashboardPage longinTo(String emailid,String pass ) {
		email.sendKeys(emailid);
		password.sendKeys(pass);
		login.click();
		return new DashboardPage();
		
	}
	public AgentPage moveingToAgentPage() {

		Actions actions = new Actions(driver);
		actions.moveToElement(team).build().perform();
		
		 actions.moveToElement(agents).click().build().perform();
		
		return new AgentPage();
		
	}
	public void AddAgent() throws InterruptedException {
		
		enterName.sendKeys("Agasibagila");
		mobileNo.sendKeys("91419520");
		enterEmail.sendKeys("Agasi@gmail.com");
		passwordInAgent.sendKeys("agasi@123");
		select.click();
		Thread.sleep(3000);
		submit.click();
		//String message= successfully.getText();
		//ok.click();
		
	}
	public void ok() {
		ok.click();
	}
	
	public CallListPage ClickOnTheAdd() {
		Actions actions = new Actions(driver);
		actions.moveToElement(call).perform();
		
		 actions.moveToElement(Add).click().perform();
		
		return new CallListPage();
	}
	public MatchFildsPage UploadFile() throws InterruptedException {
		name.sendKeys("chethan");
		selectForCall.click();
		all.click();
		file.sendKeys("C:\\Users\\cheth\\Downloads\\SampleFile.xlsx");
		//C:\\Users\\cheth\\Downloads\\SampleFile.xlsx
//		Thread.sleep(3000);
		btn.click();
		Thread.sleep(3000);
		okInCall.click();
		return  new MatchFildsPage();
		
	}
	

}