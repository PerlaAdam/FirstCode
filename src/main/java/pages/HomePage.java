package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    //elements
    String ProductName = "Sauce Labs Bike Light";
    By headerArea = By.className("app_logo");
    By productLink = By.xpath("//div[text()=\""+ProductName+"\"]");

    //action
    public void openProduct(){
        driver.findElement(productLink).click();

    }
}
