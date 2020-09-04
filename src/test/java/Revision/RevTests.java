package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by verushkat on 9/1/2020
 */
public class RevTests {

    private WebDriver driver;

    public void revision(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement link1 = driver.findElement(By.linkText("Shifting Content"));
        link1.click();

        WebElement link2 = driver.findElement(By.linkText("Example 1: Menu Element"));
        link2.click();

        List<WebElement> links3 = driver.findElements(By.tagName("li"));
        System.out.println("Number of Menu Items =  " + links3.size());

        System.out.println(driver.getTitle());





    }
    public static void main(String args[]){

        RevTests ob = new RevTests();
        ob.revision();



    }

}
