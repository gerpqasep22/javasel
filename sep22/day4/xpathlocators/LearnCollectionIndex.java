package sep22.day4.xpathlocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCollectionIndex {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Collection Based (or) Index Based XPath
		
		//Using the Item index: 
		driver.findElement(By.xpath("(//input[@name='webform'])[6]")).click();
		
		//Using Child Item index:
		driver.findElement(By.xpath("(//div[@style='margin-left:20px;'])/input[4]")).click();
		
		//Using AND Condition:
		driver.findElement(By.xpath("//input[@name='webform' and @id='vfb-7-1']")).click();
		
		//Using OR Condition:
		driver.findElement(By.xpath("(//input[@name='webform' or @id='vfb-6-1'])[5]")).click();
		
		
		
		driver.close();
	}

}
