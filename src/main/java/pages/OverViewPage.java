package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverViewPage {
    private WebDriver driver;

    public OverViewPage(WebDriver driver) {
        this.driver = driver;
    }
    private By finishButton = By.xpath("//a[@class=\"btn_action cart_button\"]");


    public void clickOnFinisButton(){
        driver.findElement(finishButton).click();
    }
}

