import org.testng.annotations.Test;
public class SignInTests extends BaseUI {
    @Test
    public void signInTab() {
        homePage.clickSignIn();
        homePage.enterEmailPasswordToSignIn();
    }

}
