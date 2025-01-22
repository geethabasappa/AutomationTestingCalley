package CalleyTeamsFullSetup.CalleyAutomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Base.BaseClass;
import pompages.AgentPage;
import pompages.DashboardPage;
import pompages.LoginPage;

public class AgentPageTest extends BaseClass{

	LoginPage loginPage;
	DashboardPage dashboardPage;
	AgentPage agentPage;
	
	public AgentPageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		dashboardPage =loginPage.longinTo(prop.getProperty("email"), prop.getProperty("password"));
		agentPage =dashboardPage.moveingToAgentPage();
		 
	}
	@Test(priority=1)
	public void addAgentsTo() throws InterruptedException {
		 agentPage.AddAgent();
		 Assert.assertEquals("Agent Added Successfully!", agentPage.verifyAgentAdd());
		 //agentPage.verifyAgentAdd();
		agentPage.ok();
	}
	
	



	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
	
}
