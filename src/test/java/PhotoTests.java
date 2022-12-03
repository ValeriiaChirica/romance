import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class PhotoTests extends BaseUI {

    @Test
    public void photosTab() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(7));
        driver.findElement(Locators.LINK_PHOTOS).click();
        Data.currentTitle = driver.findElement(Locators.CURRENT_TITLE).getText();
        System.out.println(Data.currentTitle);
        Assert.assertEquals(Data.currentTitle, Data.expectedTitlePhotos);
    }
}
