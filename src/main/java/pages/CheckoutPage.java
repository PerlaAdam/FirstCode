package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private final WebDriver driver;
    public CheckoutPage (WebDriver driver) {
        this.driver = driver;
    }
    By checkoutButton = By.className("checkout_button");
    public void navigateToCheckoutInfo(){
        driver.findElement(checkoutButton).click();
    }
}
