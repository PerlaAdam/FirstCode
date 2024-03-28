package firstTest;

import org.testng.annotations.Test;
import pages.*;

public class CheckoutInfoTest extends BaseTest {

    @Test
    public void testCheckoutInfo(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutInfo checkoutInfo = new CheckoutInfo(driver);
        loginPage.navigateToHomePage("standard_user", "secret_sauce");
        homePage.navigateToProductPage();
        productPage.addToCard();
        productPage.moveToCartPage();
        checkoutPage.navigateToCheckoutInfo();
        checkoutInfo.navigateToCheckoutReview();
    }
}
