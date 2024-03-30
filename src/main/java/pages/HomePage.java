package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
         WebDriver driver;
        public HomePage (WebDriver driver){
            this.driver = driver;
        }
        //elements
        String ProductName = "Sauce Labs Bike Light";
         By productLink = By.xpath("//div[text()=\""+ProductName+"\"]");
        By assertElement = By.className("peek");
        By getAssertElement(){
           return assertElement;
       }

    //action
    public void navigateToProductPage(){
           driver.findElement(productLink).click();
    }

    }

