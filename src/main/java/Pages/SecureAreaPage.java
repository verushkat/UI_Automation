package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by verushkat on 9/1/2020
 */
public class SecureAreaPage {

    private WebDriver driver;
    private By statusAlert = By.id("flash");

    public SecureAreaPage(WebDriver driver){

        this.driver = driver;
    }
    public String getAlertText(){

        return driver.findElement(statusAlert).getText();

    }


}
