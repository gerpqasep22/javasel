package sep22.day12_TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNG {
  
  @Test
  public void guru99Login() {
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/");
	  driver.manage().window().maximize();
	  
	  
	  
  }
}
