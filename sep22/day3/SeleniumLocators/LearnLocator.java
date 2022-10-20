package sep22.day3.SeleniumLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnLocator {

	public static void main(String[] args) {
		//Setup the WebDriver Environment variable
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts();
				
		driver.findElement(By.name("emailid")).sendKeys("sudhakar.karuppannan@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		driver.close();
		
	}

}
