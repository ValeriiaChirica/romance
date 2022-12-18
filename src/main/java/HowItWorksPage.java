import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HowItWorksPage extends BaseActions {

    public HowItWorksPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void getTitleHowItWorks(){
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
        Data.currentTitle = driver.findElement(Locators.CURRENT_TITLE).getText();
        System.out.println(Data.currentTitle);
        Assert.assertEquals(Data.currentTitle, Data.expectedTitleHowItWorks);
    }


}
