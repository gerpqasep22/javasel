package sep22.day5.RelationXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LearnDropDown {
	
	public static ChromeDriver driver;
	
	/*
	 * public void select() { for (int i=0; i<40; i++) {
	 * 
	 * } }
	 */

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		
		LearnDropDown ld = new LearnDropDown();
		
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equalsIgnoreCase("Register: Mercury Tours"))
		{
			System.out.println("Title is : " + title + "pass");			
		}
		
		else 
		{
			System.out.println("Title is : " + title + "which is not expected - Fail");
		}
		
		
		
		for (int i=0; i<40; i++)
		{
			Select select = new Select(country);
			select.selectByIndex(i);	
		}
		
		
		
		
		
		
		
		

	}

}
