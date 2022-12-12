import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
public class HowItWorksTests extends BaseUI{

    @Test
    public void howItWorksTab() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(7));
        driver.findElement(Locators.LINK_HOW_IT_WORKS).click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
        Data.currentTitle = driver.findElement(Locators.CURRENT_TITLE).getText();
        System.out.println(Data.currentTitle);
        Assert.assertEquals(Data.currentTitle, Data.expectedTitleHowItWorks);
    }
    }
