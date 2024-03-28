package firstTest;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends BaseTest{
    @Test
    public void testHomePage(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.navigateToHomePage("standard_user", "secret_sauce");
        homePage.navigateToProductPage();
    }
}
