package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage (WebDriver driver){
            this.driver = driver;
    }

    //elements
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By errorButton = By.className("error-button");

    //action
    public void navigateToHomePage(String username, String password){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
    public boolean isLoggedSuccessfully(){
        HomePage homePage = new HomePage(driver);
        return driver.findElement(homePage.getAssertElement()).isDisplayed();


    }
    //getter
    public By getErrorButton(){
        return errorButton;
    }
}

