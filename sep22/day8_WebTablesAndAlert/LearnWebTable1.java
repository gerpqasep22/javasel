package sep22.day8_WebTablesAndAlert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Step1: Find the WebTable
		WebElement webTable = driver.findElement(By.xpath("(//table)[2]"));
		
		//Step2: From WebTable, get into all the Rows (Multiple Row)
		List<WebElement> allRows = webTable.findElements(By.tagName("tr"));
		
		
		for (int i=0; i<allRows.size(); i++)
		{
			//Step3: Get into each tableRow
			WebElement eachRow = allRows.get(i);
			
			//Step4: Get in to all the Columns
			List<WebElement> allColumns = eachRow.findElements(By.tagName("td"));
			
			//Step5: Get in to each Column and get the Column Value
			
			for (int j=0; j<allColumns.size(); j++)
			{
				String eachColumnValue = allColumns.get(j).getText();
				System.out.println(eachColumnValue);
			}
			
			
		}
		driver.close();
		
		
	}

}
