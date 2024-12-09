package pages;

import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage extends BaseClass{
	
//	public void enterEmail(){
//	 WebElement email=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"ti_email\"]"));
//	 email.sendKeys("lendsome.getsome@gmail.com");
//	}
//	
//	public void enterPassword(){
//		 WebElement password=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"ti_password\"]"));
//		 password.sendKeys("Test@123");
//		}
//	public void clickLogin(){
//		 WebElement loginButton=driver.findElement(By.xpath("(//android.view.View[@resource-id=\"btn_login\"])[2]/android.widget.Button"));
//		 loginButton.click();
//		}
//	public void clickSkip(){
//		 WebElement skipButton=driver.findElement(By.xpath("//android.view.View[@resource-id=\"btn_skip\"]/android.widget.Button"));
//		 skipButton.click();
//		}
	
	private AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }
	
	private static final By EMAIL_FIELD = By.xpath("//android.widget.EditText[@resource-id='ti_email']");
    private static final By PASSWORD_FIELD = By.xpath("//android.widget.EditText[@resource-id='ti_password']");
    private static final By LOGIN_BUTTON = By.xpath("(//android.view.View[@resource-id='btn_login'])[2]/android.widget.Button");
    private static final By SKIP_BUTTON = By.xpath("//android.view.View[@resource-id='btn_skip']/android.widget.Button");
    
    public void enterEmail(String email) {
        sendKeysToElement(EMAIL_FIELD, email);
    }
    public void enterPassword(String password) {
    	sendKeysToElement(PASSWORD_FIELD, password);
    }
    public void clickLogin() {
        clickElement(LOGIN_BUTTON);
    }

    public void clickSkip() {
        clickElement(SKIP_BUTTON);
    }
	
}
