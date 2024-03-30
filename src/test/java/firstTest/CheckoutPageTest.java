package firstTest;

import org.testng.annotations.Test;
import pages.*;

public class CheckoutPageTest extends BaseTest{
    @Test
    public void testCheckoutPage() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        loginPage.navigateToHomePage("standard_user", "secret_sauce");
        homePage.navigateToProductPage();
        productPage.addToCard();
        productPage.moveToCartPage();
        checkoutPage.navigateToCheckoutInfo();

    }
}
