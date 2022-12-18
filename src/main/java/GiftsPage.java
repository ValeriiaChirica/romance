import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GiftsPage extends BaseActions {

    public GiftsPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void findBear(){
        driver.findElement(Locators.INPUT_SEARCH).sendKeys(Data.searchTextForBear);
        WebElement buttonSearch = driver.findElement(Locators.BUTTON_SEARCH);
        buttonSearch.click();
        Data.currentTitle = driver.findElement(Locators.BEAR_TITLE).getText();
        System.out.println(Data.currentTitle);
        Assert.assertEquals(Data.currentTitle, Data.expectedTitleBear);
    }


}
