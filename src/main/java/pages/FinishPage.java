package pages;

import org.openqa.selenium.By;

public class FinishPage {
    private final By assertFinisButton = By.xpath("//h2[text()=\"THANK YOU FOR YOUR ORDER\"]");

    public By getAssertFinisButton(){
        return assertFinisButton;
    }
}
