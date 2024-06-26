package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    public LoginPage (WebDriver driver){
            this.driver = driver;
    }
    //elements
    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorButton = By.className("error-button");

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

