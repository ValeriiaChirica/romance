import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import javax.swing.*;
import java.time.Duration;
public class BaseUI {

    WebDriver driver;
    WebDriverWait wait;
    String mainUrl = "https://romanceabroad.com";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, (Duration.ofSeconds(20)));
        driver.manage().window().maximize();
        driver.get(mainUrl);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

    }

    @AfterMethod
    public void afterActions(){
        driver.quit();
    }
    public void getDropDownListByIndex (WebElement element , int index) {
        Select dropDown = new Select(element);
        dropDown.selectByIndex(index);
    }
    public void getDropDownListByValue (WebElement element , String value) {
        Select dropDown = new Select(element);
        dropDown.selectByValue(value);
    }
    public void getDropDownListByText (WebElement element ,String text ) {
        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(text);
    }

    public void clickByMouse (WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }


}
