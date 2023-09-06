package PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
@FindBy(xpath ="//header/div[1]/div[1]/ul[1]/li[2]")
WebElement btn_home_signin;
@FindBy(xpath = "//input[@id='email']")
WebElement txt_email;
@FindBy(xpath ="//fieldset[@class='fieldset login']//input[@id='pass']")
WebElement txt_password;
@FindBy(xpath = "//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]")
WebElement btn_signin;
@FindBy(xpath = "//header/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]")
WebElement label_welcome_name;
@FindBy(xpath="//body/div[2]/main[1]/div[2]/div[2]/div[1]/div[1]")
WebElement lablel_invalidLogin;
WebDriver driver;
 public LoginPage_PF(WebDriver driver) {
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
public void validate_invalid_login() {
	lablel_invalidLogin.isDisplayed();
}
}
