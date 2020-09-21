package pages;

import core.TestConfig;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage extends BasePage {

    By form = By.xpath(".//form[@id='form']");
    By contactName = By.xpath(".//input[@name='contact']");
    By addressLine1 = By.xpath(".//input[@name='address-line-1']");
    By country = By.xpath(".//input[@name='country']");
    By phoneNumber = By.xpath(".//input[@name='phone']");
    By emailAddress = By.xpath(".//input[@name='email']");
    By contactInvalid = By.xpath(".//div[@id='contact-error']");
    By addressLine1Invalid = By.xpath(".//div[@id='address-line-1-error']");

    private WebDriver driver;

    public FormPage(WebDriver driver) throws Exception {
        this.driver = driver;
    }

    public void launchApp(){
        driver.get(TestConfig.getProperty("appBaseURL"));
    }

    public boolean ifNavigatedToForm(){
        return driver.findElement(form).isDisplayed();
    }

    public void enterContactName(String name){
        enterDetail(driver, name, contactName);
    }

    public void enterAddressLine1(String address1) throws InterruptedException {
        enterDetail(driver, address1, addressLine1);
        Thread.sleep(2000);
    }

    public void enterCountry(String aCountry){
        enterDetail(driver, aCountry, country);
    }

    public void enterPhoneNumber(String number){

        enterDetail(driver, number, phoneNumber);
    }

    public void enterEmailAddress(String email){
        enterDetail(driver, email, emailAddress);
    }

    public boolean isContactInvalidDisplayed(){
        return isInvalidErrorDisplayed(driver, contactInvalid);
    }

    public boolean isAddressLine1InvalidDisplayed(){
        return isInvalidErrorDisplayed(driver, addressLine1Invalid);
    }

    public void clearAddressLineOneField(){
        clearField(driver, addressLine1);
    }
}
