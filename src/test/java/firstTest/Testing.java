package firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");
    }
    String ProductName = "Sauce Labs Bike Light";
    //elements

    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By errorButton = By.className("error-button");
    By headerArea = By.className("app_logo");
    By productLink = By.xpath("//div[text()=\""+ProductName+"\"]");
    By priceAmount = By.className("inventory_details_price");


    // data
    String validUsername = "standard_user";
    String validPassword = "secret_sauce";
    String invalidUsername ="fjdghj";
    String invalidPassword = "yuijn";
    String expectedPrice = "$9.99";

    public void exit(){

    }
@Test
    public void ValidLogin(){
        driver.findElement(usernameField).sendKeys(validUsername);
        driver.findElement(passwordField).sendKeys(validPassword);
        driver.findElement(loginButton).click();
        boolean isHeaderDisplayed = driver.findElement(headerArea).isDisplayed();
        Assert.assertTrue(isHeaderDisplayed);
    }
    @Test
    public void invalidLogin(){
    driver.findElement(usernameField).sendKeys(invalidUsername);
    driver.findElement(passwordField).sendKeys(invalidPassword);
    driver.findElement(loginButton).click();
    boolean isErrorDisplayed = driver.findElement(errorButton).isDisplayed();
    Assert.assertTrue(isErrorDisplayed);
    }
    @Test
public void productPrice() {
    driver.findElement(usernameField).sendKeys(validUsername);
    driver.findElement(passwordField).sendKeys(validPassword);
    driver.findElement(loginButton).click();
    driver.findElement(productLink).click();
    String actualPrice = driver.findElement(priceAmount).getText();
    Assert.assertEquals(actualPrice,expectedPrice);
}

    @AfterMethod
    public void end(){
        driver.quit();
    }
}
