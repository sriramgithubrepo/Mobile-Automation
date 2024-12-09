package pages;

import org.openqa.selenium.By;

	import io.appium.java_client.android.AndroidDriver;

	public class HomePage extends BaseClass {
		
		private AndroidDriver driver;

	    public HomePage(AndroidDriver driver) {
	        this.driver = driver;
	    }
		
		//Locators
		    private static final By WELCOME_TEXT = By.xpath("//android.widget.TextView[@resource-id='tv_home_welcome_title']");
		    private static final By SEARCH_ICON = By.xpath("//android.widget.Button[@resource-id='search']");
		    private static final By SEARCH_FIELD = By.xpath("//android.widget.EditText[@resource-id='et_search']");
		    private static final By PRODUCT_SUGGESTIONS = By.xpath("//android.widget.TextView[@text='Product suggestions']");
		    private static final By CHOSEN_PRODUCT = By.xpath("//android.widget.TextView[@resource-id='tv_list_item_text' and @text='GLYCOWOHL Vitamin B12 1000 µg hochdos.vegan Kaps.']");
		    private static final By ADD_TO_CART_BUTTON = By.xpath("//android.widget.TextView[@text='Add to cart']");
		    private static final By PRODUCT_ADDED_TO_CART = By.xpath("//android.widget.TextView[@resource-id='tv_product_in_cart_title']");
		    private static final By REMOVE_PRODUCT_BUTTON = By.xpath("//android.view.View[@resource-id='cl_cart']/android.widget.Button[1]");
		 //   private static final By DELETE_CART_ITEM = By.xpath("//android.widget.FrameLayout[@resource-id=\"shop.shop_apotheke.com.shopapotheke.debug:id/bottom_sheet.scene_container\"]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView[2]/android.view.View[1]/android.widget.Button[1]]");
		    private static final By CHECK_CART_ITEM = By.xpath("//android.widget.FrameLayout[@content-desc='Cart, 1 new notification']");
		    private static final By REMOVE_CART_ITEM = By.xpath("//android.widget.Button[@resource-id=\"shop.shop_apotheke.com.shopapotheke.debug:id/btn_subtract\"]");
		//    private static final By CONTINUE_SHOPPING = By.xpath("//android.widget.Button[@resource-id=\"shop.shop_apotheke.com.shopapotheke.debug:id/btn_buy_further\"]");
		    
		    
		  //android.widget.FrameLayout[@resource-id="shop.shop_apotheke.com.shopapotheke.debug:id/bottom_sheet.scene_container"]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView[2]/android.view.View[1]/android.widget.Button[1]
		  //android.widget.Button[@resource-id="shop.shop_apotheke.com.shopapotheke.debug:id/btn_buy_further"   
//		public String welcomeText(){
//			 WebElement welcomeText=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"tv_home_welcome_title\"]"));
//			 return welcomeText.getText();
//			}
//		public void clickSearchIcon(){
//			 WebElement searchIcon=driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"search\"]"));
//			 searchIcon.click();
//			}
//		public void enterProductToSearch(){
//			 WebElement enterProduct=driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"et_search\"]"));
//			 enterProduct.sendKeys("Vitamin b12");
//			}
//		public boolean checkProductsAreSuggested(){
//			 WebElement productSuggestions=driver.findElement(By.xpath("//android.widget.TextView[@text=\"Product suggestions\"]"));
//			 return productSuggestions.isDisplayed();
//			}
//		public void chooseProduct(){
//			 WebElement chooseProduct=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"tv_list_item_text\" and @text=\"GLYCOWOHL Vitamin B12 1000 µg hochdos.vegan Kaps.\"]"));
//			 chooseProduct.click();
//			}
//		public void clickAddToCart(){
//			 WebElement addToCart=driver.findElement(By.xpath("//android.widget.TextView[@text=\"Add to cart\"]"));
//			 addToCart.click();
//			}
//		public String checkProductAddedToCart(){
//			 WebElement addToCart=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"tv_product_in_cart_title\"]"));
//			return addToCart.getText();
//			}
//		public void removeProductFromCart(){
//			 WebElement removeProductFromCart=driver.findElement(By.xpath("//android.view.View[@resource-id=\"cl_cart\"]/android.widget.Button[1]"));
//			 removeProductFromCart.click();
//			}
		    
		    public String getWelcomeText() {
		        return getElementText(WELCOME_TEXT);
		    }

		    public void clickSearchIcon() {
		        clickElement(SEARCH_ICON);
		    }

		    public void searchForProduct(String productName) {
		        clickSearchIcon(); // Opens the search bar
		        sendKeysToElement(SEARCH_FIELD, productName); // Enters the product name
		    }

		    public boolean isProductSuggested() {
		        return isElementDisplayed(PRODUCT_SUGGESTIONS);
		    }

		    public void chooseProduct() {
		        clickElement(CHOSEN_PRODUCT);
		    }

		    public void addToCart() {
		    	if(isElementDisplayed(ADD_TO_CART_BUTTON)==true) {
		        clickElement(ADD_TO_CART_BUTTON);
		    	}else{
		    		clickElement(REMOVE_PRODUCT_BUTTON);
	    			clickElement(ADD_TO_CART_BUTTON);
		    	}
		    }

		    public String getAddedToCartMessage() {
		        return getElementText(PRODUCT_ADDED_TO_CART);
		    }

		    public void removeProductFromCart() {
		        clickElement(CHECK_CART_ITEM);
		        clickElement(REMOVE_CART_ITEM);
		    }
		    
}
