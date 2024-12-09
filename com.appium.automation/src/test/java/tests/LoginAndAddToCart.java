package tests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.PreLogin;
import utils.ConfigReader;
import pages.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class LoginAndAddToCart extends BaseClass{
	
	PreLogin prelogin= new PreLogin(driver);
	LoginPage loginPage= new LoginPage(driver);
	HomePage homePage = new HomePage(driver);
	
	public void preLogin() {
		Assert.assertEquals(prelogin.getChooseCountryText(),ConfigReader.getProperty("launchPageText"));
		prelogin.selectCountryGermany();
		prelogin.selectEnglishLanguage();
		prelogin.clickAgreeButton();
		Assert.assertEquals(prelogin.getLoginPageText(), ConfigReader.getProperty("loginPageText"), "Login page text didnt match");
		prelogin.clickLoginButton();
	}
	
	public void login() {
		loginPage.enterEmail(ConfigReader.getProperty("email"));
		loginPage.enterPassword(ConfigReader.getProperty("password"));
		loginPage.clickLogin();
		loginPage.clickSkip();
	}
	public void searchAndAddToCart() {
		Assert.assertTrue(homePage.getWelcomeText().contains("Hello"),"Welcome text does not match");
		homePage.searchForProduct("Vitamin b12");
		Assert.assertEquals(homePage.isProductSuggested(), true);
		homePage.chooseProduct();
		homePage.addToCart();
		Assert.assertTrue(homePage.getAddedToCartMessage().contains("In cart"),"Product not Added");
		homePage.removeProductFromCart();
	}
	
	@Test
	public void loginAndAddToCart() throws MalformedURLException  {
		preLogin();
		login();
		searchAndAddToCart();		
	}

}
