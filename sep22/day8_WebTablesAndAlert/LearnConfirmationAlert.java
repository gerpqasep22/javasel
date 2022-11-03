package sep22.day8_WebTablesAndAlert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnConfirmationAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().dismiss();

	}

}
