package CalleyTeamsFullSetup.CalleyAutomation;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import pompages.AgentPage;
import pompages.CallListPage;
import pompages.DashboardPage;
import pompages.LoginPage;

public class DashboardPageTest extends BaseClass{

	LoginPage loginPage;
	DashboardPage dashboardPage;
	AgentPage agentPage;
	CallListPage callListPage;
	
	public DashboardPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		dashboardPage =loginPage.longinTo(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@Test(priority=2)
	public   void clickOnAgent()  {

		agentPage =dashboardPage.moveingToAgentPage();
	}
	@Test(priority=1)
	public void validateUserName() {
		String name =dashboardPage.verifyTitle();
		Assert.assertEquals("Hi Geetha", name);
	
	}
	public void add() {
		callListPage =dashboardPage.ClickOnTheAdd();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
