package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by verushkat on 9/2/2020
 */
public class KeyPressPage {

    private WebDriver driver;
    private By inputfield = By.id("target");
    private By resulttext = By.id("result");

    public KeyPressPage(WebDriver driver){

        this.driver=driver;
    }
    public void typeOnKeyPressTextField(String text){

        driver.findElement(inputfield).sendKeys(text);

    }
    public String getKeyPressText(){

        return driver.findElement(resulttext).getText();

    }


}
