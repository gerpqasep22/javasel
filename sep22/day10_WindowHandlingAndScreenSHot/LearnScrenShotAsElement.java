package sep22.day10_WindowHandlingAndScreenSHot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScrenShotAsElement {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement getTrainButton = driver.findElement(By.id("buttonFromTo"));

		Date date = new Date();
		String dateValue = date.toString();
		
		//regular expression
		String dateRegularExpression = dateValue.replaceAll("[:, ]", "");
		
		//Step1:Get the source screen shot as output file
		File sourceScreenShot = getTrainButton.getScreenshotAs(OutputType.FILE);
		
		//Step2: Create the Target File
		File targetScreenShot = new File("./sep22screenshot/getTrainButton"+dateRegularExpression+".jpeg");
		
		//Step3: Copy source to the target location
		FileUtils.copyFile(sourceScreenShot, targetScreenShot);
		
		System.out.println("completed");

	}

}
