package runner;

import org.apache.commons.math3.analysis.function.Abs;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features/loginorange.feature", "src/test/java/features/MainMenuLinks.feature"},
				 glue = "StepDefntn",
				 monochrome = true,
				 publish = true)
public class Cucumberrunnerorangelogin extends AbstractTestNGCucumberTests{

	
}
