package sep22.day10_WindowHandlingAndScreenSHot;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandlesWithMethod {
	
	//Global variable declaration
	public static ChromeDriver driver;
	
	public void windowHandles(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windowHandle = new ArrayList<String>(windowHandles);
		
		String screenWindow = windowHandle.get(index);
		driver.switchTo().window(screenWindow);
	}
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		LearnWindowHandlesWithMethod lwhm = new LearnWindowHandlesWithMethod();
		lwhm.windowHandles(1);
		
		driver.findElement(By.name("emailid")).sendKeys("test@test.com");
		
		lwhm.windowHandles(0);
		String text = driver.findElement(By.className("barone")).getText();
		System.out.println(text);
	}

}
