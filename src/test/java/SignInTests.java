import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import java.time.Duration;
public class SignInTests extends BaseUI {

    @Test
    public void signInTab() {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(7));
        driver.findElement(Locators.LINK_SIGN_IN).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TEXT_FIELD_EMAIL_SIGN_IN));
        driver.findElement(Locators.TEXT_FIELD_EMAIL_SIGN_IN).sendKeys(Data.emailSignInValues);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD_SIGN_IN).sendKeys(Data.passwordSignInValues);
        driver.findElement(Locators.BUTTON_SUBMIT).click();

    }

}
