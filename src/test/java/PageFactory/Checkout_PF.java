package PageFactory;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefinitions.ExcelReader;

import org.openqa.selenium.support.ui.*;
import io.cucumber.messages.types.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_PF {
	@FindBy(xpath ="//header/div[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement btn_home_signin;
	@FindBy(xpath = "//input[@id='email']")
	WebElement txt_email;
	@FindBy(xpath ="//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/input[1]")
	WebElement txt_password;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]")
	WebElement btn_signin;
	@FindBy(xpath = "//header/div[2]/div[1]/a[1]")
	WebElement btn_icon;
	@FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
	WebElement btn_proceed;
	@FindBy(name = "company")
	WebElement txt_company;
	@FindBy(name ="street[0]")
	WebElement txt_address;
	@FindBy(name = "city")
	WebElement txt_city;
	@FindBy(xpath = "//option[contains(text(),'California')]")
	WebElement dropdown_state;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/div[1]/div[9]/div[1]/input[1]")
	WebElement txt_phoneno;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/div[1]/div[7]/div[1]/input[1]")
	WebElement txt_zipcode;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/div[1]/div[8]/div[1]/select[1]")
	WebElement dropdown_country;
	@FindBy(xpath = "//tbody/tr[2]/td[1]/input[1]")
	WebElement radio_mentod;
	@FindBy(xpath = "//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[2]/div[1]/div[3]/form[1]/div[3]/div[1]/button[1]")
	WebElement btn_next;
	@FindBy(xpath  ="//button[@title='Place Order']")
	WebElement btn_place_order;
	@FindBy(name = "telephone")
	WebElement txt_phone_no;
	WebDriver driver;
	 public Checkout_PF(WebDriver driver) {
		this.driver= driver;
		 PageFactory.initElements(driver, this); 
	 }
	 public void click_on_signin(){
			btn_home_signin.click();
		}
		public void enter_email() {
			txt_email.sendKeys("lososidojit@gotgel.org");
		}
		public void enter_password() {
			txt_password.sendKeys("Quali@2023");
		}
		public void click_on_submit() throws Exception {
			btn_signin.click();
			Thread.sleep(5000);
			
		}
		public void click_on_icon() {
			btn_icon.click();
		}
		public void hover_on_proceed() throws Exception {
//			Actions actions = new Actions(driver);
//			actions.moveToElement(btn_icon);
//			actions.click().perform();
			btn_proceed.click();
			Thread.sleep(5000);
		}
		public void fill_in_data() throws Exception {
			ExcelReader reader = new ExcelReader("./src/test/java/Utils/Automation_Excel.xlsx");
			String sheetName = "sheet1";
			  String comp =reader.getCellData(sheetName, 0, 2);
			  txt_company.sendKeys(comp);
			  String address= reader.getCellData(sheetName, 1, 2);
			  txt_address.sendKeys(address);
			  String city= reader.getCellData(sheetName, 2, 2);
			  txt_city.sendKeys(city);
			  dropdown_state.findElement(By.xpath("//option[contains(text(),'Texas')]")).click();
			  String zip= reader.getCellData(sheetName, 3, 2);
			  txt_zipcode.sendKeys(zip);
			  dropdown_country.findElement(By.xpath("//option[contains(text(),'United States')]")).click();
			  String phoneno= reader.getCellData(sheetName, 4, 2);
			  txt_phone_no.sendKeys(phoneno);
			  radio_mentod.click();
			  btn_next.click();
			  Thread.sleep(3000);
			  
		}
		public void click_on_place_order(){
			
			btn_place_order.click();
		}
	

}
