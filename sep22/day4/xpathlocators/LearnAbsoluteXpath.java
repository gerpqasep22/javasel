package sep22.day4.xpathlocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAbsoluteXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Absolute XPath
		driver.findElement(By.xpath("//html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input")).sendKeys("Constitution Street");

		//Relative XPath - Attribute Based Xpath
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Detroit");
		
		//Relative XPath - Text Based XPath
		//driver.findElement(By.xpath("//a[text()='CONTACT']")).click();
		
		//Relative XPath - Partial Attibute Based XPath
		driver.findElement(By.xpath("//input[contains(@name,'confirm')]")).sendKeys("password");
		
		//Relative XPath - Partial Text Based XPath
		driver.findElement(By.xpath("//a[contains(text(),'SIGN')]")).click();
		
		
		
		

	}

}
