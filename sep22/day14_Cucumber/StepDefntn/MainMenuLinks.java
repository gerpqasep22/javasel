package StepDefntn;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainMenuLinks extends BaseClass {
	
	@When("Click the Add Employee link")
	public void clickLink() {
		driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
	}
	
	@Then("Add Employee page should be displayed")
	public void addEmployee() {
		String text = driver.findElement(By.xpath("(//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title'])")).getText();
		
		if (text.equals("Add Employee"))
		{
			System.out.println("Add Employee page is displayed");
		}
	}

}
