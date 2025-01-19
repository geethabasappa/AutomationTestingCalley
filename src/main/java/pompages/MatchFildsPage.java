package pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.BaseClass;

public class MatchFildsPage extends BaseClass{

	@FindBy(xpath="//select[@name='ddlbelongto_1']")
	WebElement dropdown;
	
	@FindBy(xpath="//select[@name='ddlbelongto_1']")
	WebElement dropdown1;
	
	@FindBy(xpath="//select[@name='ddlbelongto_3']")
	WebElement dropdown2;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	
	public MatchFildsPage() {
	
	PageFactory.initElements(driver, this);
}
public void SelectClass() {
	
	Select select = new Select(dropdown);
	select.selectByVisibleText("FirstName");
	Select select1 = new Select(dropdown1);
	select1.selectByVisibleText("Phone");
	Select select2 = new Select(dropdown1);
	select2.selectByVisibleText("Notes");
	submit.click();
	
	
}
	
	
}
