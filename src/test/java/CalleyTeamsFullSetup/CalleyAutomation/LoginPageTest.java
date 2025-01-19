package CalleyTeamsFullSetup.CalleyAutomation;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import Base.BaseClass;
import pompages.DashboardPage;
import pompages.LoginPage;


public class LoginPageTest extends BaseClass{

	
	LoginPage loginPage;
	DashboardPage dashboardPage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public   void login()  {

		dashboardPage =loginPage.longinTo(prop.getProperty("email"), prop.getProperty("password"));
	        
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
