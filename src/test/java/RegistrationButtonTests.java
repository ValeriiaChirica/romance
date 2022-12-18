import org.testng.annotations.Test;
public class RegistrationButtonTests extends BaseUI{
    @Test
    public void registrationButton() {
        homePage.clickJoinButton();
        homePage.firstPartOfRegistration();
        homePage.secondPartOfRegistration();

    }
}
