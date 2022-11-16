package StepDefntn;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests{

	public static ChromeDriver driver;
	
	
	@BeforeMethod
	  public void beforeMethod() {
		 
		WebDriverManager.chromedriver().setup();  
		  driver = new ChromeDriver();
		   
			  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			  driver.manage().window().maximize();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }
}
