package step_definitions;

import core.TestConfig;
import org.openqa.selenium.WebDriver;
import pages.FormPage;

import java.io.File;
import java.util.Map;

public class BaseSteps {

    private static WebDriver driver = null;

    public BaseSteps() throws Exception { }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void setDriver(WebDriver driver){
        BaseSteps.driver = driver;
    }

    public FormPage getFormPage() throws Exception {
        return new FormPage(driver);
    }

}
