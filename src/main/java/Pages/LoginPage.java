package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by verushkat on 9/1/2020
 */
public class LoginPage {

            private WebDriver driver;
            private By usernameField = By.id("username");
            private By passwordField = By.id("password");
            private By loginField = By.cssSelector("#login button");


            public LoginPage(WebDriver driver){

                this.driver = driver;

            }

            public void setUsernameField(String username){

                    driver.findElement(usernameField).sendKeys(username);
            }
            public void setPasswordField(String password){

                    driver.findElement(passwordField).sendKeys(password);
            }
            public SecureAreaPage clickLoginButton(){

                driver.findElement(loginField).click();
                return new SecureAreaPage(driver);


            }


}
