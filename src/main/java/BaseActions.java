import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseActions(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public static String generateNewNickname(String name, int length){
        return name + RandomStringUtils.random(length, "172984757");
    }
    public static String generateNewEmail(String name, int length){
        return name + RandomStringUtils.random(length, "asdfghjkl") + "@gmail.com";
    }
    public static String generateNewPhoneNumber(String name, int length){
        return "+1" + RandomStringUtils.random(length, "172984757") ;
    }

        public static String generateNewPassword(String name, int length){
        return name + RandomStringUtils.random(length, "172984757") ;
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
