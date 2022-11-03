package sep22.day8_WebTablesAndAlert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Step1: Get in to the WebTable		
		WebElement webTable = driver.findElement(By.xpath("(//table)[2]"));
		
		//Step2: Get into the Table Rows
		List<WebElement> allRows = webTable.findElements(By.tagName("tr"));
		
		//Step3: Accessing the one of the index of TableRow and get the Text 
		//String text = tableRows.get(0).getText();
		//int size = tableRows.size();
		//System.out.println(size);
		
		//Step3: Access all the rows of the WebTable		
		for (int i=0; i<allRows.size(); i++)
		{
			//Step4: Get in to each Row
			WebElement tableRow = allRows.get(i);
			
			
			//Step5; Get in to all tableData (Multiple Columns)
			List<WebElement> allColumns = tableRow.findElements(By.tagName("td"));
			
			for (int j=0; j<allColumns.size(); j++)
			{
				String colTextValue = allColumns.get(j).getText();
				System.out.println(colTextValue);	
			}
			
			
			
			
		}
		
		
		
		driver.close();
		
		
	}

}
