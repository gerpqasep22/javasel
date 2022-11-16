package sep22.day13_TestNGPart2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnStaticDataParametrization extends BaseClass {
 
	@Test (dataProvider = "fetchData")
	public void learnStaticDataParmetrization(String fname, String lname) {
		
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]")).click();
		driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).sendKeys(fname);
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("lastName")).sendKeys(lname);
		driver.findElement(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]")).click();
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon'])")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	@DataProvider
	public String[][] fetchData() throws IOException
	{
		ReadExcelData rd = new ReadExcelData();
		String[][] fetchData = rd.fetchData();
		return fetchData;
	}
	
	
}
