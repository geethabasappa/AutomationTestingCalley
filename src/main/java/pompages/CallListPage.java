package pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class CallListPage  extends BaseClass{

	@FindBy(xpath="//input[@placeholder='List Name']")
	WebElement name;
	
	@FindBy(xpath="//button[@title='Please select an agent']")////button[@type='button']
	WebElement select;
	
	@FindBy(xpath="//input[@value='all']")
	WebElement all;
	
	@FindBy(xpath="//input[@type='file']")
	WebElement file;
	////p[@id='btnUp']
	
	@FindBy(xpath="//p[@id='btnUp']")
	WebElement btn;
	
	@FindBy(xpath="//button[text()='Ok']")
	WebElement ok;
	
public  CallListPage() {
		
		PageFactory.initElements(driver, this);
	}
	public MatchFildsPage UploadFile() throws InterruptedException {
		name.sendKeys("Geetha");
		select.click();
		all.click();
		file.sendKeys("C:\\Users\\cheth\\Downloads\\SampleFile.xlsx");
//		Thread.sleep(3000);
//		btn.click();
		Thread.sleep(8000);
		ok.click();
		return  new MatchFildsPage();
		
	}

}

