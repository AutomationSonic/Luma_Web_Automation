package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage_PF {
	@FindBy(xpath ="//input[@id='search']")
	WebElement txt_searchFied;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/h1[1]/span[1]")
	WebElement lbl_searchResult;
	WebDriver driver;
	 public SearchPage_PF(WebDriver driver) {
		this.driver= driver;
		 PageFactory.initElements(driver, this); 
	 }
	 
	 public void clck_on_searchfield(String keyword) {
		 txt_searchFied.sendKeys(keyword);
		 txt_searchFied.sendKeys(Keys.ENTER);
	 }
	 public void getSearchResultsText() {
		 lbl_searchResult.isDisplayed();
	 }

}
