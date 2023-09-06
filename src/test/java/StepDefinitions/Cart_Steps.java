package StepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.Cart_PF;
import Utils.DriverManager;
import io.cucumber.java.en.*;


public class Cart_Steps {
	
		WebDriver driver;
		Cart_PF cart;
		public Cart_Steps() {
			driver = DriverManager.getDriver();
			cart = new Cart_PF(driver);
		}
@Given("^User is successfully logged in using valid (.*) and (.*)$")
public void user_is_successfully_logged_in_using_valid_lososidojit_gotgel_org_and_quali(String Username,String Password) {
	driver.manage().window().maximize();
	driver.get("https://magento.softwaretestingboard.com/");
	cart.click_on_signin();
	cart.enter_email(Username);
	cart.enter_password(Password);
	cart.click_on_submit();
	cart.validate_login();
}
@And("Hover the mouse cursor over the Mens section and select the section")
public void hover_the_mouse_cursor_over_the_mens_section_and_select_the_section() {
	cart.add_items_to_cart();
}
@Then("Add items to cart")
public void add_items_to_cart() {
	cart.validate_add_cart();
    driver.close();
}


}


