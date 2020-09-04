package Dropdown;

import Base.BaseMain;
import Pages.DropdownPage;
import jdk.nashorn.internal.ir.CallNode;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by verushkat on 9/1/2020
 */
public class DropdownTests extends BaseMain {

    @Test
    public void testSelectOption(){

        DropdownPage dropdownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropdownPage.selectFromDropDown(option);
        List<String> selectedOptions = dropdownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");

    }
}

