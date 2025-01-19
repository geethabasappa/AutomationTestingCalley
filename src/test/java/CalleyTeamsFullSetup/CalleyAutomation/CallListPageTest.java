package CalleyTeamsFullSetup.CalleyAutomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import pompages.CallListPage;
import pompages.DashboardPage;
import pompages.LoginPage;
import pompages.MatchFildsPage;

public class CallListPageTest  extends BaseClass{

	LoginPage loginPage;
	DashboardPage dashboardPage;
	CallListPage callListPage;
	MatchFildsPage matchFildsPage;
	public CallListPageTest(){
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		dashboardPage =loginPage.longinTo(prop.getProperty("email"), prop.getProperty("password"));
		callListPage =dashboardPage.ClickOnTheAdd();
	}
	@Test
	public void UploadFiletoCallList() throws InterruptedException {
		matchFildsPage=callListPage.UploadFile();
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
