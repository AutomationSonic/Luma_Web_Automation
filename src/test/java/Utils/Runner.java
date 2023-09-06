package Utils;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\Features"},
glue = "StepDefinitions",
plugin = {
    "pretty",
    "html:target/extent-report.html",
    "json:target/cucumber-report.json",
    "junit:target/cucumber-report.xml"
},monochrome = true
)

public class Runner {

	
}
