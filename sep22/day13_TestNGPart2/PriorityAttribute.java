package sep22.day13_TestNGPart2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PriorityAttribute {
  
	@Test (priority =-1)
	public void learnConfirmationAlert() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.close();
		
		

	}
	
	@Test (priority=0)
	public void learnSimpleAlert() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Text is: " + alertText);
		driver.switchTo().alert().accept();
		
		String result = driver.findElement(By.xpath("//p[@id='result']")).getText();
		if (result.equals("You successfully clicked an alert"))
		{
			System.out.println("Pass - You successfully clicked an alert message displayed");
		}
		
		else
			System.out.println("Fail - You successfully clicked an alert message not displayed");
		

		driver.close();
	}
	
	@Test (dependsOnMethods={"learnSimpleAlert","learnConfirmationAlert"})
	public void learnPromptAlert() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("Hi, This is Sudhakar");
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().dismiss();
		
			

		driver.close();
		
	}
	
	@Test (priority=1)
	public void learnWebTables() throws InterruptedException {
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
