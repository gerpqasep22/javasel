package sep22.day9_FramesSuppressBrowserNotification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String firstText = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
		System.out.println("FirstText is :"+ firstText);
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("(//b[@id='topic'])/following::input")).sendKeys("Hi, Welcome to Frames");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		
		//Switch to the parent frame
		//driver.switchTo().parentFrame();
		
		//Switch to the home window (html DOM page)
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement animalsDropDown = driver.findElement(By.xpath("//select[@id='animals']"));
		Select animals = new Select(animalsDropDown);
		animals.selectByIndex(2);
		
		driver.switchTo().defaultContent();
		String firstRepeatText = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
		System.out.println("FirstText is :"+ firstRepeatText);
		
		
		

	}

}
