package firstTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest{
    //data
    String validUsername = "standard_user";
    String validPassword = "secret_sauce";
    String invalidUsername ="fjdghj";
    String invalidPassword = "yuijn";

    @Test
    public void testValidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToHomePage(validUsername, validPassword);
        Assert.assertTrue(loginPage.isLoggedSuccessfully());

    }
    @Test
    public void testInvalidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToHomePage(invalidUsername,invalidPassword);

    }

}

