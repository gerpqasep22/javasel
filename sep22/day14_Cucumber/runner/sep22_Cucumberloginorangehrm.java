package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "src/test/java/features/sep22_orangehrmlogin.feature",
					glue = "StepDefntn",
					monochrome = true,
					publish = true)

public class sep22_Cucumberloginorangehrm extends AbstractTestNGCucumberTests{

}
