package sep22.day4.xpathlocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAxesBasedXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Axes Based Xpath - Using Younger Sibling
		//driver.findElement(By.xpath("(//li[@style='width:100%;'])[28]/following-sibling::li[1]")).click();

		//Axes Based Xpath - Using Elder Sibling
		//driver.findElement(By.xpath("(//li[@style='width:100%;'])[8]/preceding-sibling::li[1]")).click();
		
		//Axes Based Xpath - Using Elder Cousin
		driver.findElement(By.xpath("//a[text()='QTP (Quick Test Professional)']/preceding::a[1]")).click();
		
		
		
	}

}
