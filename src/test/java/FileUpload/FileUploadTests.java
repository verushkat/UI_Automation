package FileUpload;

import Base.BaseMain;
import Pages.FileUploadPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by verushkat on 9/2/2020
 */
public class FileUploadTests extends BaseMain {

    @Test
    public void uploadFileTests() {

        FileUploadPage uploadPage = homePage.clickFileUploadPageLink();
        uploadPage.clickChooseFileButton("E:\\Selenium_Practice\\resources\\chromedriver.exe");
        Assert.assertEquals(uploadPage.fileUploadedConfirmation(),"chromedriver.exe", "Uploaded files incorrect");

    }


}
