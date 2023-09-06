package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import PageFactory.Checkout_PF;
import Utils.DriverManager;
public class Checkout_Steps {
	
	WebDriver driver;
	Checkout_PF checkout;
	
	public Checkout_Steps() {
		driver = DriverManager.getDriver();
		checkout = new Checkout_PF(driver);
	}
	@Given("The user is logged in") 
	public void userIsLoggedIn() throws Exception { 
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		checkout.click_on_signin();
		checkout.enter_email();
		checkout.enter_password();
		checkout.click_on_submit();
	}
	@When("The user clicks on cart icon and hovers the mouse to click Proceed") 
	public void userClicksOnCartAndHoversToProceed() throws Exception {
		checkout.click_on_icon();
		checkout.hover_on_proceed();
	}
	@When("User fill in the Checkout details and clicks Next")
	public void userFillsCheckoutDetailsAndClicksNext() throws Exception { 
		checkout.fill_in_data();
 }
	@Then("Click on Placeorder")
	public void userClicksOnPlaceOrder() { 
		checkout.click_on_place_order();
		} 
	}




