package Utils;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver; 
public class DriverManager { 
	private static WebDriver driver; 
	public static WebDriver getDriver() { 
		if (driver == null) { System.setProperty("webdriver.edge.driver", "C:src\\test\\resources\\Drivers\\msedgedriver.exe"); 
		driver = new EdgeDriver(); }
		return driver; } 
	public static void quitDriver() { 
		if (driver != null) 
		{ 
			driver.quit(); 
			driver = null; } 
		
	} 
	}
