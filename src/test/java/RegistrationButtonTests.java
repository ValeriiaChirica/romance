import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class RegistrationButtonTests extends BaseUI{

    @Test
    public void registrationButton() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
        WebElement registrationButton = driver.findElement(Locators.BUTTON_REGISTRATION);
        registrationButton.click();
        wait = new WebDriverWait(driver, (Duration.ofSeconds(20)));
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TEXT_FIELD_EMAIL));
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.emailValues);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.passwordValues);
        WebElement nextButton = driver.findElement(Locators.BUTTON_NEXT);
        nextButton.click();

    }
}
