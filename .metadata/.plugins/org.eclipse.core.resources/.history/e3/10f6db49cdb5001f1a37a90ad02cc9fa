package pages;

import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;

public class PreLogin extends BaseClass {	
	
	
//	public String getChooseCountryText() {
//	   WebElement chooseCountryText=driver.findElement(By.xpath("//android.widget.TextView[@text='Please select the country where you would like to receive your orders']"));
//       return chooseCountryText.getText();
//	
//	}
//	
//	public void clickCountry() {
//		
//		WebElement chooseCountryGermany=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"tv_title\" and @text=\"Germany\"]"));
//		chooseCountryGermany.click();
//		
//	}
//   public void clickEnglishLanguage() {
//		
//		WebElement chooseEnglishLanguage=driver.findElement(By.xpath("//android.view.View[@resource-id=\"mcv_item_en\"]/android.view.View"));
//		chooseEnglishLanguage.click();
//		
//	}
//   public void clickAgreeButton() {
//		
//		WebElement agreeButton=driver.findElement(By.xpath("//android.view.View[@resource-id='btn_agree']/android.widget.Button"));
//		agreeButton.click();
//		
//	}
//   public String verifyLoginPageText() {
//		
//		WebElement loginPageText=driver.findElement(By.xpath("//android.widget.TextView[@text=\"Browse through our wide range of products\"]"));
//		  return loginPageText.getText();
//		
//	}
//   public void clickLoginButton() {
//		
// 		WebElement loginButton=driver.findElement(By.xpath("//android.view.View[@resource-id=\"btn_login\"]/android.widget.Button"));
// 		loginButton.click();
// 		
// 	}
	
	private AndroidDriver driver;

    public PreLogin(AndroidDriver driver) {
        this.driver = driver;
    }
	
	// Locators
    private static final By CHOOSE_COUNTRY_TEXT = By.xpath("//android.widget.TextView[@text='Please select the country where you would like to receive your orders']");
    private static final By COUNTRY_GERMANY = By.xpath("//android.widget.TextView[@resource-id='tv_title' and @text='Germany']");
    private static final By ENGLISH_LANGUAGE = By.xpath("//android.view.View[@resource-id='mcv_item_en']/android.view.View");
    private static final By AGREE_BUTTON = By.xpath("//android.view.View[@resource-id='btn_agree']/android.widget.Button");
    private static final By LOGIN_PAGE_TEXT = By.xpath("//android.widget.TextView[@text='Browse through our wide range of products']");
    private static final By LOGIN_BUTTON = By.xpath("//android.view.View[@resource-id='btn_login']/android.widget.Button");
    
    public String getChooseCountryText() {
        return getElementText(CHOOSE_COUNTRY_TEXT);
    }
    public void selectCountryGermany() {
        clickElement(COUNTRY_GERMANY);
    }
    public void selectEnglishLanguage() {
        clickElement(ENGLISH_LANGUAGE);
    }

    public void clickAgreeButton() {
        clickElement(AGREE_BUTTON);
    }

    public String getLoginPageText() {
        return getElementText(LOGIN_PAGE_TEXT);
    }

    public void clickLoginButton() {
        clickElement(LOGIN_BUTTON);
    }
}