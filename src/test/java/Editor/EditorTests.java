package Editor;

import Base.BaseMain;
import Pages.HomePage;
import Pages.WysiwigEditorPage;
import org.testng.annotations.Test;

/**
 * Created by verushkat on 9/3/2020
 */
public class EditorTests extends BaseMain {

    @Test
    public void EditorTextTests(){

        WysiwigEditorPage editorsPage = homePage.clickWYSIWYGEditorlink();
        editorsPage.clearTextLine();
        editorsPage.enterTextLine();



    }


}
