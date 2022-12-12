import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import java.time.Duration;
public class RegistrationButtonTests extends BaseUI{

    @Test
    public void registrationButton() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
        WebElement registrationButton = driver.findElement(Locators.BUTTON_REGISTRATION);
        registrationButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TEXT_FIELD_EMAIL));
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.emailValues);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.passwordValues);
        WebElement nextButton = driver.findElement(Locators.BUTTON_NEXT);
        nextButton.click();
        WebElement nickname = driver.findElement(Locators.INPUT_NICKNAME);
        nickname.sendKeys("user123");
        WebElement daySelect = driver.findElement(Locators.SELECT_DAY);
        daySelect.click();
        driver.findElement(Locators.DAY_10).click();
        WebElement monthSelect = driver.findElement(Locators.SELECT_MONTH);
        monthSelect.click();
        driver.findElement(Locators.MONTH_MAY).click();
        WebElement yearSelect = driver.findElement(Locators.SELECT_YEAR);
        yearSelect.click();
        driver.findElement(Locators.YEAR_1943).click();
        WebElement phoneNumber = driver.findElement(Locators.INPUT_PHONE_NUMBER);
        phoneNumber.sendKeys("+617000000");
        WebElement location = driver.findElement(Locators.INPUT_LOCATION);
        location.sendKeys("lviv");
        wait.until(ExpectedConditions.textToBe(Locators.DROP_DOWN_REGION_LVIV, "Lviv, Ukraine"));
        WebElement locationLviv = driver.findElement(Locators.DROP_DOWN_REGION_LVIV);
        locationLviv.click();
        WebElement checkBoxOnForRegistration = driver.findElement(Locators.CHECK_BOX_ON_REGISTRATION);
        checkBoxOnForRegistration.click();
        if (checkBoxOnForRegistration.isSelected()) {
            System.out.println("Check Box is selected");
        }
    }
}
