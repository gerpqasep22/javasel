package StepDefntn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOrangeHRM extends BaseClass{


	/*
	 * @Given ("User opens the browser") public void openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }
	 */
	
	/*
	 * @Given ("Access the valid url") public void accessURL() { driver.get(
	 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); }
	 */	
	
	@Given ("Enter valid username {string}")
	public void validUserName(String uname)
	{
		driver.findElement(By.name("username")).sendKeys(uname);
	}
	
	@Given ("Enter valid password {string}")
	public void validPassword(String pword) {
		driver.findElement(By.name("password")).sendKeys(pword);
	}
	
	@When ("Click the Login buttons")
	public void clickLogin()
	{
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
	
	@Then ("OrangeHRM PIM page is displayed")
	public void pimPage()
	{
		String text = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		if (text == "PIM")
			System.out.println("Pass");
	}
	
	  @When ("Click the {string} link") 
	  public void clickLeave(String textLink) 
	  {
	  if (textLink == "Leave") 
		  driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")).click(); 
	  else if (textLink == "Time") 
		  driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[4]")).click(); 
	  }
	 
	
	  @Then ("{string} page is displayed") 
	  public void leavePage(String pageDisplayed) 
	  { 
		  if (pageDisplayed == "Leave") 
		  { 
			  String pageText =  driver.findElement(By.xpath("(//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module'])")).getText();
	  	  if (pageText == "Leave") 
	  	  { 
	  		  System.out.println("Leave Page is displayed"); 
	  		 }
	  else if (pageText == "Time") 
	  {
	  System.out.println("Time / Timesheet Page is displayed"); 
	  } 
	  	  } 
	  }
	 
	
	@Given ("Enter invalid password {string}")
	public void invalidPassword(String pword)
	{
		driver.findElement(By.name("password")).sendKeys(pword);
	}
	
	@But ("Error Invalid Credential displayed")
	public void invalidCredential()
	{
		String error = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
		if (error=="Invalid credentials")
		{
			System.out.println("Error message displayed");
		}
	}
}
