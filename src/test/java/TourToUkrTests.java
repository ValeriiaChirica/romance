import org.testng.annotations.Test;
public class TourToUkrTests extends BaseUI{
    @Test
    public void tourToUkraineTab() {
        homePage.clickTourToUkraine();
       tourToUkrainePage.getTitleTourToUkr();
    }
}
