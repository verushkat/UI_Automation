package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by verushkat on 9/1/2020
 */
public class EmailSentPage {

    private WebDriver driver;
    private By emailsentmessage = By.id("content");

    public EmailSentPage(WebDriver driver){
        this.driver = driver;

    }

    public String setEmailsentmessage(){

        return driver.findElement(emailsentmessage).getText();

    }



}
