package CalleyTeamsFullSetup.CalleyAutomation;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import pompages.AgentPage;
import pompages.CallListPage;
import pompages.DashboardPage;
import pompages.LoginPage;
import pompages.MatchFildsPage;
import pompages.NewPage;

public class NewPageTest  extends BaseClass{

	NewPage newPage;
	LoginPage loginPage;
	DashboardPage dashbordPage;
	AgentPage agentPage;
	CallListPage callListPage;
	MatchFildsPage matchFildsPage;
	

	public NewPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		newPage = new NewPage();
		
		 
	}
	@Test
	public void fullTest() throws InterruptedException {
		dashbordPage=newPage.longinTo(prop.getProperty("email"), prop.getProperty("password"));
		agentPage =newPage.moveingToAgentPage();
		newPage.AddAgent();
		newPage.ok();
		callListPage=newPage.ClickOnTheAdd();
		matchFildsPage =newPage.UploadFile();
		 
		
	}
	
@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
	
}
