package A_cucmber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP\\eclipse-workspace\\Z4_scenarioOutlineWithMultipledata\\src\\test\\java\\Examplemultipaldata\\priya1.feature",
glue = "A_cucmber",
tags = "@RegressionTest",
monochrome = true,
dryRun =  true)

public class EXamplerunner {

}
