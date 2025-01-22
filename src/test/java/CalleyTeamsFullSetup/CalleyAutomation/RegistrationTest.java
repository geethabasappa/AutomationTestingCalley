package CalleyTeamsFullSetup.CalleyAutomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import pompages.DashboardPage;
import pompages.RegistrationPage;

public class RegistrationTest  extends BaseClass{

	RegistrationPage registrationPage;
	DashboardPage dashboardPage;
	
	public RegistrationTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 registrationPage =new RegistrationPage();
		
	}
	
	@Test
	public void registration() throws InterruptedException {
		dashboardPage =  registrationPage.registrationPageCreation();
		registrationPage.freeTrialCall();
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
