package KeyPress;

import Base.BaseMain;
import Pages.KeyPressPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by verushkat on 9/2/2020
 */
public class KeyTests extends BaseMain {

    @Test
    public void testBackspace(){

        KeyPressPage keyPage = homePage.clickKeyPresses();
        keyPage.typeOnKeyPressTextField("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getKeyPressText(),"You entered: BACK_SPACE");



    }


}
