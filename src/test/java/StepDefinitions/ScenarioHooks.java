package StepDefinitions;

import io.cucumber.java.After; 
import io.cucumber.java.Scenario; 
import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot;

import Utils.DriverManager; 
public class ScenarioHooks { 
	@After 
	public void tearDown(Scenario scenario) { 
		if (scenario.isFailed()) { // Capture and attach a screenshot if the scenario failed 
			byte[] screenshot = ((TakesScreenshot) 
					DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES); scenario.attach(screenshot, "image/png", "Failed Screenshot"); 
					} 
		DriverManager.quitDriver(); 
		}
	}
