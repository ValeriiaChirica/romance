import org.testng.annotations.Test;
public class HowItWorksTests extends BaseUI {
    @Test
    public void howItWorksTab() {
        homePage.clickHowItWorks();
        howItWorksPage.getTitleHowItWorks();
    }

}
