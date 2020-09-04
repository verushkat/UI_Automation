package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by verushkat on 9/3/2020
 */
public class WysiwigEditorPage {

    private WebDriver driver;
    private By textToClear = By.id("tinymce");
    private String editorIframeID = "mce_0_ifr";

    public  WysiwigEditorPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clearTextLine(){

        driver.findElement(textToClear).clear();
    }
    private void switchToEditArea(){

        driver.switchTo().frame(editorIframeID);
    }



    public void enterTextLine(){

        driver.findElement(textToClear).sendKeys("tinymce");
    }

}
