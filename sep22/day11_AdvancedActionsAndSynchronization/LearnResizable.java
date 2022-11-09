package sep22.day11_AdvancedActionsAndSynchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnResizable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		WebElement resizable = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-resizable']"));

		Actions action = new Actions(driver);
		action.dragAndDropBy(resizable, 60, 60).perform();
		//action.clickAndHold(resizable).moveByOffset(60, 60).perform();
		System.out.println("test");
	}

}
