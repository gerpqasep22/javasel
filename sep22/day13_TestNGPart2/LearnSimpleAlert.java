package sep22.day13_TestNGPart2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSimpleAlert {

	@Test (priority=2)
	public void learnSimpleAlert() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Text is: " + alertText);
		driver.switchTo().alert().accept();
		
		String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
		if (result.equals("You successfully clicked an alert"))
		{
			System.out.println("Pass - You successfully clicked an alert message displayed");
		}
		
		else
			System.out.println("Fail - You successfully clicked an alert message not displayed");
		
		
		driver.close();
	}

}
