package CalleyTeamsFullSetup.CalleyAutomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import pompages.CallListPage;
import pompages.DashboardPage;
import pompages.LoginPage;
import pompages.MatchFildsPage;

public class MatchFilsPageTest extends BaseClass{

	LoginPage loginPage;
	DashboardPage dashboardPage;
	CallListPage callListPage;
	MatchFildsPage matchFildsPage;
	public MatchFilsPageTest(){
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		dashboardPage =loginPage.longinTo(prop.getProperty("email"), prop.getProperty("password"));
		callListPage =dashboardPage.ClickOnTheAdd();
		matchFildsPage=callListPage.UploadFile();
	}
	
	@Test
	public void fillingTheForm() {
		matchFildsPage.SelectClass();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
