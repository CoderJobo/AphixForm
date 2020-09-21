package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public void enterDetail(WebDriver driver, String detail, By field){
        driver.findElement(field).sendKeys(detail);
    }

    public boolean isInvalidErrorDisplayed(WebDriver driver, By error){
        boolean invalid = false;
        try{
            invalid = driver.findElement(error).isDisplayed();
        }
        catch(Exception e){
        }
        return invalid;
    }

    public void clearField(WebDriver driver, By field){
        driver.findElement(field).clear();
    }

}
