package Pages;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by verushkat on 9/2/2020
 */
public class FileUploadPage {

    public WebDriver driver;
    private By chooseFileButton = By.id("file-upload");
    private By UploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {

        this.driver = driver;
    }
    public void clickChooseFileButton(String absolutePathOfFile){

        driver.findElement(chooseFileButton).sendKeys(absolutePathOfFile);
        clickUploadFileButton();

    }

    public void clickUploadFileButton(){

        driver.findElement(UploadButton).click();
    }

    public String fileUploadedConfirmation(){

        return  driver.findElement(uploadedFiles).getText();
    }

}
