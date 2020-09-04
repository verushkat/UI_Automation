package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by verushkat on 9/1/2020
 */
public class EmailPage {

    private WebDriver driver;
    private By emailtextfield = By.id("email");
    private By retrivepasswordbutton = By.id("form_submit");


    public EmailPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmailtextfield(String email){

        driver.findElement(emailtextfield).sendKeys(email);

    }


    public EmailSentPage retriveButtonClick(){

        driver.findElement(retrivepasswordbutton).click();
        return new EmailSentPage(driver);

    }




}
