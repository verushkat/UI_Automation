package EmailSent;

import Base.BaseMain;
import Pages.EmailPage;
import Pages.EmailSentPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by verushkat on 9/1/2020
 */
public class EmailSentTest extends BaseMain {

    @Test
    public void emailsent(){

        EmailPage emaillink = homePage.clickEmailPage();
        emaillink.setEmailtextfield("test@gmail.com");
        EmailSentPage emailsentpage = emaillink.retriveButtonClick();
        assertTrue(emailsentpage.setEmailsentmessage().contains("Your e-mail's been sent!"),"Alert Text is incorrect");



    }




}
