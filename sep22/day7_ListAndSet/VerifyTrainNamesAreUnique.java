package sep22.day7_ListAndSet;

	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.LinkedHashSet;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class VerifyTrainNamesAreUnique {

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
				fromStation.sendKeys("MAS");
				fromStation.sendKeys(Keys.TAB);
				
				//Enter to station
				WebElement toStation = driver.findElement(By.id("txtStationTo"));
				toStation.clear();
				toStation.sendKeys("MDU");
				toStation.sendKeys(Keys.TAB);

				Thread.sleep(2000);
				
				
				// get size of rows
				List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
				int rowSize = tableRows.size();
				System.out.println(rowSize);
				
				List<String> trainNames = new ArrayList<String>();
				
				// iterate through the rows
				for(int i=2; i<=rowSize; i++) {
					String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]//td[2]//a")).getText();
					trainNames.add(text);
					//System.out.println(text);
				}
				
				Set<String> setTrainNames = new LinkedHashSet<String>(trainNames);
				
				//if the size of the list and set are same -> there is no duplicate
				//if the size of the list and set are different -> there is duplicate
				
				if(trainNames.size() == setTrainNames.size()) {
					System.out.println("No duplicate train names");
				}else {
					System.out.println("duplicate train names are there");
				}
			}
		}