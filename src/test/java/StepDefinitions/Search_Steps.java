package StepDefinitions;

import org.openqa.selenium.WebDriver;

import PageFactory.SearchPage_PF;
import Utils.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_Steps {
	WebDriver driver;
	SearchPage_PF search;
	public Search_Steps(){
		driver=DriverManager.getDriver();
		search = new SearchPage_PF(driver);
		
	}
	
	@Given("The user is on the Home page")
    public void userIsOnHomePage() {
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
    }

    @When("^The user enters the (.*) on the SearchField and searched$")
    public void userEntersKeywordOnSearchField(String keyword) {
        search.clck_on_searchfield(keyword); 
    }

    @Then("Search results are displayed")
    public void searchResultsAreDisplayed() {
        search.getSearchResultsText();
    }

}
