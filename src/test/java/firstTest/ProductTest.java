package firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    public void productPrice() {
        driver.findElement(usernameField).sendKeys(validUsername);
        driver.findElement(passwordField).sendKeys(validPassword);
        driver.findElement(loginButton).click();
        driver.findElement(productLink).click();
        String actualPrice = driver.findElement(priceAmount).getText();
        Assert.assertEquals(actualPrice,expectedPrice);
    }
}
