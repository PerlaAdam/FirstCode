package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInfo {

    private final WebDriver driver;
    public CheckoutInfo(WebDriver driver){
        this.driver = driver;
    }
    By firstNameField = By.id("first-name");
    By lastNameField = By.id("last-name");
    By postalCodeField = By.id("postal-code");
    By continueButton = By.className("cart_button");

    public void navigateToCheckoutReview(){
        driver.findElement(firstNameField).sendKeys("sjhhs");
        driver.findElement(lastNameField).sendKeys("sjhhs");
        driver.findElement(postalCodeField).sendKeys("sjhhs");
        driver.findElement(continueButton).click();

    }
}
