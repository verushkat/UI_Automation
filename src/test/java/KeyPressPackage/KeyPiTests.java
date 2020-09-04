package KeyPressPackage;

import Base.BaseMain;
import Pages.KeyPage;
import org.testng.annotations.Test;

/**
 * Created by verushkat on 9/2/2020
 */
public class KeyPiTests extends BaseMain {

    @Test
    public void keypienter(){

        KeyPage keypientertext = homePage.clickKeyPage();
        keypientertext.enterPi();

   }
}
