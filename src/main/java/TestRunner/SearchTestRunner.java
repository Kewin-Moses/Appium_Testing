package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = {"src/main/resources/features"},glue = {"src/main/java/stepDefinition"}, dryRun = true)
public class SearchTestRunner extends AbstractTestNGCucumberTests{

}
