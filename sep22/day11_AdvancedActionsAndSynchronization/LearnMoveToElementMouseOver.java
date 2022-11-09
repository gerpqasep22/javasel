package sep22.day11_AdvancedActionsAndSynchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMoveToElementMouseOver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gapcanada.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement boys = driver.findElement(By.xpath("//a[@aria-label='boys']"));
		Actions action = new Actions(driver);
		action.moveToElement(boys).perform();
		
		driver.findElement(By.xpath("//a[@aria-label='categories sweaters']")).click();

	}

}
