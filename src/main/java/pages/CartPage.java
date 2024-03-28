package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver = driver;
    }
    By productName = By.xpath("//div[text()=\\\"Sauce Labs Backpack\\");
    public By getProductName(){
        return productName;
    }
}
