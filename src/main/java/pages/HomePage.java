package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
        private WebDriver driver;
        public HomePage (WebDriver driver){

            this.driver = driver;
        }
        //elements
        String ProductName = "Sauce Labs Bike Light";
        private By productLink = By.xpath("//div[text()=\""+ProductName+"\"]");
       private By assertElement = By.className("peek");

       public By getAssertElement(){
           return assertElement;
       }


    //action
    public void navigateToProductPage(){
        driver.findElement(productLink).click();
    }

    }

