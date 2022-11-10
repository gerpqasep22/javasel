package sep22.day12_TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SecondTest extends Sep22BaseClass{
  
	
	@Test
  public void f() {
	  
	  String text = driver.findElement(By.xpath("//p[text()='OrangeHRM OS 5.2']")).getText();
	  System.out.println(text); 
	  
	
  }


}
