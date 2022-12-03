import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class BlogTests extends BaseUI{

    @Test
    public void blogTab() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.findElement(Locators.LINK_BLOG).click();
        Data.currentTitle = driver.findElement(Locators.CURRENT_TITLE).getText();
        System.out.println(Data.currentTitle);
        Assert.assertEquals(Data.currentTitle, Data.expectedTitleBlog);

    }
}