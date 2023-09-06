package PageFactory;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_PF {
	
	@FindBy(xpath ="//header/div[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement btn_home_signin;
	@FindBy(xpath = "//input[@id='email']")
	WebElement txt_email;
	@FindBy(xpath ="//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[3]/div[1]/input[1]")
	WebElement txt_password;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]")
	WebElement btn_signin;
	@FindBy(xpath = "//header/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]")
	WebElement label_welcome_name;
	@FindBy(xpath = "//span[contains(text(),'Men')]")
	WebElement label_men;
	@FindBy(css = "#ui-id-17")
	WebElement dropdwn_top;
	@FindBy(css = "#ui-id-19")
	WebElement dropdwn_jackets;
	@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[2]/div[1]/a[1]/span[1]/span[1]/img[1]")
	WebElement select_jacket;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]")
	WebElement jacket_M;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[4]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	WebElement jackket_colour;
	@FindBy(xpath = "//input[@id='qty']")
	WebElement jacket_qty;
	@FindBy(xpath = "//button[@id='product-addtocart-button']")
	WebElement jacket_add_to_cart;
	@FindBy(xpath = "//header/div[2]/div[1]/a[1]")
	WebElement my_cart;
	@FindBy(xpath = "//a[contains(text(),'Montana Wind Jacket')]")
	WebElement cart_validation;
	WebDriver driver;
	 public Cart_PF(WebDriver driver) {
		this.driver= driver;
		 PageFactory.initElements(driver, this); 
	 }
	public void click_on_signin(){
		btn_home_signin.click();;
	}
	public void enter_email(String Username) {
		txt_email.sendKeys(Username);
	}
	public void enter_password(String Password) {
		txt_password.sendKeys(Password);
	}
	public void click_on_submit() {
		btn_signin.click();
	}
	public void validate_login() {
		label_welcome_name.isDisplayed();
	}
	public void add_items_to_cart() {
		 Actions actions = new Actions(driver);
		 actions.moveToElement(label_men).build().perform();
		 actions.moveToElement(dropdwn_top).build().perform();
		 actions.moveToElement(dropdwn_jackets);
		 actions.click().perform();
		 select_jacket.click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 jacket_M.click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 jackket_colour.click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 jacket_qty.sendKeys("2");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 jacket_add_to_cart.click();
		
	}
	public void validate_add_cart() {
		my_cart.click();
		cart_validation.isDisplayed();
	}
	}

