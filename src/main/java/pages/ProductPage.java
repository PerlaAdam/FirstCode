package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;
    public ProductPage(WebDriver driver){
        this.driver = driver;
    }
    //elements
    private final By productPrice = By.className("inventory_details_price");
    By cartButton = By.className("btn_inventory");
    By cartIcon = By.id("shopping_cart_container");
    By assertElement = By.xpath("//a[@class=\"btn_action checkout_button\"]");

    public By getAssertElement(){
        return assertElement;
    }

    By getProductPrice(){
        return productPrice;
    }
    public void addToCard() {
        driver.findElement(cartButton).click();
    }
    public void moveToCartPage(){
        driver.findElement(cartIcon).click();
    }
}
