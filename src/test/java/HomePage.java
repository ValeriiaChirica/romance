import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePage extends BaseUI{

    @Test
    public void homePage() {

        WebElement ele = driver.findElement(Locators.IFRAME_ELE);
        driver.switchTo().frame(ele);
        WebElement youTubePlay = driver.findElement(Locators.BUTTON_YOU_TUBE);
        youTubePlay.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if (youTubePlay.isEnabled()) {
            System.out.println("VIDEO IS PLAYING");
        }






    }
}
