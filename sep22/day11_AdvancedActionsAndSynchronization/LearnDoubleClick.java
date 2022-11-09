package sep22.day11_AdvancedActionsAndSynchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDoubleClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://developer.mozilla.org/en-US/docs/Web/API/Element/dblclick_event");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);

		WebElement doubleClick = driver.findElement(By.xpath("//h3[text()='My Card']"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleClick).perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
