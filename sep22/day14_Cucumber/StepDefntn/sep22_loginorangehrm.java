package StepDefntn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class sep22_loginorangehrm {
		
		public static ChromeDriver driver;
		
		@Given("Open Chrome browser")
		public void openBrowser()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		
		@Given("Load the application URL")
		public void loadUrl()
		{
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
				
		@Given ("Enter the username as {string}")
		public void enterUserName(String username)
		{
		driver.findElement(By.name("username")).sendKeys(username);
		}
		
		@Given ("Enter the password as {string}")
		public void enterPassword(String password)
		{
			driver.findElement(By.name("password")).sendKeys(password);
		}
		
		@When ("Click the Login button")
		public void clickLogin()
		{
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();	
		}
		
		@Then("Orangehrm home page displayed")
		public void orangeHrmHome()
		{
			String text = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
			if(text.equalsIgnoreCase("Dashboard"))
			{
				System.out.println("Home Page is displayed - Pass");
			}
		}
		
		@But("Error message displayed")
		public void errorMessage()
		{
			String text = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
			if(text.equalsIgnoreCase("Invalid credentials"))
			{
				System.out.println("Error message displayed - Pass");
			}
		}
}
