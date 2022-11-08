package sep22.day10_WindowHandlingAndScreenSHot;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windowHandle = new ArrayList<String>(windowHandles);
		
		String screenWindow = windowHandle.get(1);
		String firstWindow = windowHandle.get(0);
		
		driver.switchTo().window(screenWindow);
		
		driver.findElement(By.name("emailid")).sendKeys("test@test.com");
		
		driver.switchTo().window(firstWindow);
		System.out.println(driver.getTitle());
																																
		

	}

}
