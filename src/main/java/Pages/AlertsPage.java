package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by verushkat on 9/2/2020
 */
public class AlertsPage {

    public WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By results = By.id("result");
    private By triggerConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath("//button[text()='Click for JS Prompt']");

    public AlertsPage(WebDriver driver){
        this.driver = driver;

    }
    public void clickForJSAlert() {

        driver.findElement(triggerAlertButton).click();

    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        waitTillElementLoaded(results);
        return driver.findElement(results).getText();
    }

    public void clickForJSConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    public String alert_getText(){

        return driver.switchTo().alert().getText();
    }
    public void alert_clickToDismiss(){

        driver.switchTo().alert().dismiss();

    }
    public void clickJSPromptButton(){
        driver.findElement(triggerPromptButton).click();
    }

    public void alert_setInput(String text){

        driver.switchTo().alert().sendKeys(text);
    }



    public void waitTillElementLoaded(By by){
        new WebDriverWait(driver, 15L).until(ExpectedConditions.visibilityOfElementLocated(by));

    }

}
