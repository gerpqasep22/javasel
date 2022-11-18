package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import jul22.week4.day19.TestNGAnnothations.BaseClass;


	@CucumberOptions (features = "src/test/java/features",
						glue = "StepDefntn",
						monochrome = true,
						publish = true,
						tags = "not @smoke")

	public class sep22_Cucumberloginorangehrm extends AbstractTestNGCucumberTests
	{

	}

