package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.LoginPage_PF;
import Utils.DriverManager;
import io.cucumber.java.en.*;

public class Login_Steps {

	WebDriver driver;
	LoginPage_PF login;
	public Login_Steps(){
		driver=DriverManager.getDriver();
		login = new LoginPage_PF(driver);
		
	}
	@Given("User is on the Login page")
    public void userIsOnLoginPage() {
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		login.click_on_signin();
	   
	}

	@When("^User enters valid (.*) and (.*)$")
    public void userEntersValidCredentials(String Email , String Pin) {
		login.enter_email(Email);
		login.enter_password(Pin);
	 
	}
	@When("^User enters invalid (.*) and (.*)$")
    public void userEntersInvalidCredentials(String Username , String Password) {
        login.enter_email(Username);
        login.enter_password(Password);
    }

	@And("Clicks on the Login button")
    public void clicksOnLoginButton() {
		login.click_on_submit();
	 
	}
	@Then("User is logged in successfully")
    public void userIsLoggedInSuccessfully() {
	   login.validate_login();
	   
	   
	}
	@Then("User is not logged in")
    public void userIsNotLoggedIn() {
		login.validate_invalid_login();
		
	}

}
