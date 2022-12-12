import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PhotoTests extends BaseUI {

    @Test
    public void photosTab() {
        driver.findElement(Locators.LINK_PHOTOS).click();
        Data.currentTitle = driver.findElement(Locators.CURRENT_TITLE).getText();
        System.out.println(Data.currentTitle);
        Assert.assertEquals(Data.currentTitle, Data.expectedTitlePhotos);
//        WebElement dropDownListAlbumType = driver.findElement(Locators.ALBUM_TYPE);
//        getDropDownListByIndex(dropDownListAlbumType, 1);
        WebElement sortByPhotos = driver.findElement(Locators.SORT_BY_PHOTOS);
        getDropDownListByIndex(sortByPhotos, 2);
        if (sortByPhotos.isSelected()){
            System.out.println("Comments count was selected from drop-down menu");
        }
    }

}
