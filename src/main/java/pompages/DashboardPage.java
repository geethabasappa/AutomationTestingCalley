package pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class DashboardPage  extends BaseClass{

	@FindBy(xpath="//h4//span[text()='Hi Geetha']")
	WebElement username;
	
	@FindBy(xpath="//span[text()='Team']")
	WebElement team;
	
	@FindBy(xpath="//span[text()='Agents']")
	WebElement agents;
	
	@FindBy(xpath="//span[text()='Call List ']")
	WebElement call;
	
	@FindBy(xpath="//span[contains(text(),'Add - Power Import')]")
	WebElement Add;
	
	
public  DashboardPage() {
		
		PageFactory.initElements(driver, this);
	}

public AgentPage moveingToAgentPage() {

	Actions actions = new Actions(driver);
	actions.moveToElement(team).perform();
	
	 actions.moveToElement(agents).click().perform();
	
	return new AgentPage();
	
}
	public String verifyTitle() {

		String name = username.getText();
		return name;
		
       
	}
	public CallListPage ClickOnTheAdd() {
		Actions actions = new Actions(driver);
		actions.moveToElement(call).perform();
		
		 actions.moveToElement(Add).click().perform();
		
		return new CallListPage();
	}


	

}
