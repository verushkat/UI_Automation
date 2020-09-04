package Hover;

import Base.BaseMain;
import Pages.HoversPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by verushkat on 9/2/2020
 */
public class HoverTests extends BaseMain {

    @Test
    public void testHoverUser1() {

        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption Not Displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title Incorrect");
        assertEquals(caption.getLinkTest(), "View profile", "Caption Link Text");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrect");
    }
}
