import org.testng.annotations.Test;
public class PhotoTests extends BaseUI {
    @Test
    public void photosTab() {
        homePage.clickPhoto();
        photoPage.getTitlePhoto();
        photoPage.sortByPhotos();
    }

}
