import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
public class GiftsTests extends BaseUI{

    @Test
    public void giftsTab() {
        driver.findElement(Locators.LINK_GIFT).click();
        driver.findElement(Locators.INPUT_SEARCH).sendKeys(Data.searchTextForBear);
        WebElement buttonSearch = driver.findElement(Locators.BUTTON_SEARCH);
        buttonSearch.click();
        Data.currentTitle = driver.findElement(Locators.BEAR_TITLE).getText();
        System.out.println(Data.currentTitle);
        Assert.assertEquals(Data.currentTitle, Data.expectedTitleBear);

    }
}
