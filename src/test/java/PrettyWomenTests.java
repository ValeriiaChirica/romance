
import org.testng.annotations.Test;
public class PrettyWomenTests extends BaseUI {
    @Test
    public void prettyWomenTab() {
        homePage.clickPrettyWomen();
        prettyWomenPage.setMaxAndMinAge();
        prettyWomenPage.selectListView();
        prettyWomenPage.sendKisses();
    }
}
