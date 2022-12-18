import org.testng.annotations.Test;
public class GiftsTests extends BaseUI{
    @Test
    public void giftsTab() {
        homePage.clickGifts();
        giftsPage.findBear();

    }
}
