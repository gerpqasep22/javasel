package sep22.day5.RelationXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnParentToChildXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Relation XPath: Parent to Child XPath
		//driver.findElement(By.xpath("(//li[@style='width:100%;'])[2]/a")).click();
		
		//Relation XPath: Child to Parent XPath
		driver.findElement(By.xpath("(//a[text()='Selenium'])/parent::li")).click();

		
	}

}
