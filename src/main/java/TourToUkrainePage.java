import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TourToUkrainePage extends BaseActions {

    public TourToUkrainePage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void getTitleTourToUkr(){
        Data.currentTitle = driver.findElement(Locators.CURRENT_TITLE).getText();
        System.out.println(Data.currentTitle);
        Assert.assertEquals(Data.currentTitle, Data.expectedTitleTour);
    }


}
