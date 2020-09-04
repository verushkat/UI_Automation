package Alerts;

import Base.BaseMain;
import Pages.AlertsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by verushkat on 9/2/2020
 */
public class AlertTests extends BaseMain {

    @Test
    public void testAcceptAlert(){

        AlertsPage alertsPage = homePage.clickAlertsPageLink();
        alertsPage.clickForJSAlert();
        alertsPage.alert_clickToAccept();
        Assert.assertEquals(alertsPage.getResult(),"You successfuly clicked an alert","Results text incorrect");
    }
    @Test
    public void testGetTextFromAlert() {
        AlertsPage alertsPage = homePage.clickAlertsPageLink();
        alertsPage.clickForJSConfirm();
        String text = alertsPage.alert_getText();
        Assert.assertEquals(alertsPage.alert_getText(), "I am a JS Confirm", "Result Incorrect");
        alertsPage.alert_clickToDismiss();
    }
    @Test
    public void testSetTextInputToAlert(){

          AlertsPage alertsPage = homePage.clickAlertsPageLink();
          alertsPage.clickJSPromptButton();
          String text = "TAU Rocks";
          alertsPage.alert_setInput(text);
          alertsPage.alert_clickToAccept();
          Assert.assertEquals(alertsPage.getResult(),"You entered: " + text,"Result Text is Incorrect");


        }





}
