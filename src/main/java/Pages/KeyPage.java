package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/**
 * Created by verushkat on 9/2/2020
 */
public class KeyPage {

    private WebDriver driver;
    private By keytextfield = By.id("target");
    private By keytextresult = By.id("result");


    public KeyPage(WebDriver driver){
        this.driver = driver;

    }
    public void enterKeyText(String text){

        driver.findElement(keytextfield).sendKeys(text);

    }

    public void enterPi(){
        enterKeyText(Keys.chord(Keys.ALT, "227") + "3.14");
    }

    public String getKeyText(){

        return driver.findElement(keytextresult).getText();

    }


}
