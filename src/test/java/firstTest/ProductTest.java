package firstTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest {
    //elements
    String ProductName = "Sauce Labs Bike Light";
    By productLink = By.xpath("//div[text()=\""+ProductName+"\"]");
    By priceAmount = By.className("inventory_details_price");
    // data
    String expectedPrice = "$9.99";
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    //data
    String validUsername = "standard_user";
    String validPassword = "secret_sauce";

    @Test
    public void testProductPage() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        loginPage.navigateToHomePage("standard_user", "secret_sauce");
        homePage.navigateToProductPage();
        productPage.addToCard();
        productPage.moveToCartPage();
    }

}
