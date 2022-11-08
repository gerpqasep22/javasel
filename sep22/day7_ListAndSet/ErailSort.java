package sep22.day7_ListAndSet;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Uncheck Sort on Date
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		
		//Enter from station
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("NDLS");
		fromStation.sendKeys(Keys.TAB);
		
		//Enter to station
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("BCT");
		toStation.sendKeys(Keys.TAB);

		Thread.sleep(10000);
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
		
		System.out.println(allRows.size());
		
		for (int i=1; i<allRows.size();i++)
		{
			WebElement eachRow = allRows.get(i);
			List<WebElement> allColumns= eachRow.findElements(By.tagName("td"));
			String trainName = allColumns.get(1).getText();
			List<String> listTrainName = new LinkedList<String>();			
			
			listTrainName.add(trainName);
			  
			  Collections.sort(listTrainName);

			  for (String sortTrainName : listTrainName) {
					System.out.println(sortTrainName);

			}
			}		
		
		}
}
