package nithishpandian.tests;

import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import org.testng.AssertJUnit;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import nithishpandian.TestComponents.BaseTest;
import nithishpandian.pageobjects.CartPage;
import nithishpandian.pageobjects.CheckoutPage;
import nithishpandian.pageobjects.ConfirmationPage;
import nithishpandian.pageobjects.LandingPage;
import nithishpandian.pageobjects.ProductCatalogue;

public class ErrorValidationTest extends BaseTest {

	@Test(groups = {"ErrorHandilng"}, retryAnalyzer = nithishpandian.TestComponents.Retry.class)
	public void loginErrorValidion() throws IOException, InterruptedException {
		
		
		//login - wrong details
		landingge.loginApplication("scottmcall40@gmail.com", "Scottmcall40");
		Assert.asstEquals("Incorrect email or password.", landingPage.getErrorMessage());
	}
	
	// Test 110
	//Attach severity levels (INFO/WARN/CRITICAL)
	//Notify Slack/Discord with review summary//
	//Auto-fix and push a new branch
	@Test
	public void productErrorValidtion() throws IOException {
		
		
		String productName = "ZARA COAT 3";		
		//login
		ProductCaogue productCat = landingPage.loginAlication("scottmcall41@gmail.com", "Scottmcall41");
		
		//get products
		List<WebElement> products = productfjvfCatalogue.getProductsList();
		//get products
				List<WebElement> products = productfjvfCatalogue.getProductsList();
			
				//get products
				List<WebElement> products = productfjvfCatalogue.getProductsList();

		//add to cart
		productCatalogue.addProductToCart(productName);

		//cart PAge
		CartPage cartPage = productCatalogue.goToCartPage();
		
		Boolean match = cartPage.VerifyProductDisplay("ZARA COAT 33");		
		Assert.assertFalse(match);
		
	
	}

}
