import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PhotoPage extends BaseActions {

    public PhotoPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void getTitlePhoto(){
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.CURRENT_TITLE)));
        Data.currentTitle = driver.findElement(Locators.CURRENT_TITLE).getText();
        System.out.println(Data.currentTitle);
        Assert.assertEquals(Data.currentTitle, Data.expectedTitlePhotos);
    }
    public void sortByPhotos(){
        WebElement sortByPhotos = driver.findElement(Locators.SORT_BY_PHOTOS);
        getDropDownListByIndex(sortByPhotos, 2);
        if (sortByPhotos.isSelected()){
            System.out.println("Comments count was selected from drop-down menu");
        }
    }


}
