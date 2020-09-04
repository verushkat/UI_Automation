package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

/**
 * Created by verushkat on 9/1/2020
 */
public class HomePage {

    private WebDriver driver;


    public HomePage(WebDriver driver){

        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){

            clickLink("Form Authentication");
            return new LoginPage(driver);
    }
    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);

    }

    public EmailPage clickEmailPage(){
        clickLink("Forgot Password");
        return new EmailPage(driver);

    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();

    }
    public HoversPage clickHovers(){

        clickLink("Hovers");
        return new HoversPage(driver);

    }

    public KeyPressPage clickKeyPresses(){

        clickLink("Key Presses");
        return new KeyPressPage(driver);

    }

    public KeyPage clickKeyPage(){

        clickLink("Key Presses");
        return new KeyPage(driver);

    }
    public AlertsPage clickAlertsPageLink(){

        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);

    }
    public FileUploadPage clickFileUploadPageLink(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public WysiwigEditorPage  clickWYSIWYGEditorlink(){

        clickLink("WYSIWYG Editor");
        return new WysiwigEditorPage(driver);


    }

}
