package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.MRS.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {
		
		try {
			prop = new Properties();
			FileInputStream ip= new FileInputStream("C:\\Users\\cheth\\eclipse-workspace\\CalleyAutomation\\src\\main\\java\\resources\\data.properties");
			 prop.load(ip);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		

	        driver=new ChromeDriver();
	} else if(browserName.equals("FF")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();

	driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

	driver.get(prop.getProperty("url"));
	
	}
}
